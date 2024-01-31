#include <stdio.h>

void strassen(int n, int A[][n], int B[][n], int C[][n]);

void addMatrix(int n, int A[][n], int B[][n], int C[][n]);
void subtractMatrix(int n, int A[][n], int B[][n], int C[][n]);

void printMatrix(int n, int matrix[][n]);

int main() {
    int n;

    printf("Enter the size of matrices (power of 2): ");
    scanf("%d", &n);

    if ((n & (n - 1)) != 0 || n <= 0) {
        printf("Please enter a valid size (power of 2).\n");
        return 1;
    }

    int A[n][n], B[n][n], C[n][n];

    printf("Enter the elements of matrix A:\n");
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            scanf("%d", &A[i][j]);
        }
    }

    printf("Enter the elements of matrix B:\n");
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            scanf("%d", &B[i][j]);
        }
    }

    strassen(n, A, B, C);

    printf("Resultant matrix C:\n");
    printMatrix(n, C);

    return 0;
}

void strassen(int n, int A[][n], int B[][n], int C[][n]) {
    if (n == 1) {
        C[0][0] = A[0][0] * B[0][0];
        return;
    }

    // Create submatrices
    int a11[n / 2][n / 2], a12[n / 2][n / 2], a21[n / 2][n / 2], a22[n / 2][n / 2];
    int b11[n / 2][n / 2], b12[n / 2][n / 2], b21[n / 2][n / 2], b22[n / 2][n / 2];
    int c11[n / 2][n / 2], c12[n / 2][n / 2], c21[n / 2][n / 2], c22[n / 2][n / 2];
    int temp1[n / 2][n / 2], temp2[n / 2][n / 2];

    // Divide matrices A and B into submatrices
    for (int i = 0; i < n / 2; ++i) {
        for (int j = 0; j < n / 2; ++j) {
            a11[i][j] = A[i][j];
            a12[i][j] = A[i][j + n / 2];
            a21[i][j] = A[i + n / 2][j];
            a22[i][j] = A[i + n / 2][j + n / 2];

            b11[i][j] = B[i][j];
            b12[i][j] = B[i][j + n / 2];
            b21[i][j] = B[i + n / 2][j];
            b22[i][j] = B[i + n / 2][j + n / 2];
        }
    }

    // Compute intermediate matrices
    subtractMatrix(n / 2, b12, b22, temp1);
    strassen(n / 2, a11, temp1, c11);

    addMatrix(n / 2, a11, a12, temp1);
    strassen(n / 2, temp1, b22, c12);

    addMatrix(n / 2, a21, a22, temp1);
    strassen(n / 2, temp1, b11, c21);

    subtractMatrix(n / 2, b21, b11, temp1);
    strassen(n / 2, a22, temp1, c22);

    // Combine intermediate matrices to form the result
    addMatrix(n / 2, c11, c12, C);
    addMatrix(n / 2, c21, c22, temp1);
    addMatrix(n / 2, temp1, C, C);
    subtractMatrix(n / 2, C, c11, C);
    addMatrix(n / 2, temp1, c12, C);
    addMatrix(n / 2, C, c21, C);
    addMatrix(n / 2, c22, C, C);
}

void addMatrix(int n, int A[][n], int B[][n], int C[][n]) {
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
}

void subtractMatrix(int n, int A[][n], int B[][n], int C[][n]) {
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            C[i][j] = A[i][j] - B[i][j];
        }
    }
}

void printMatrix(int n, int matrix[][n]) {
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            printf("%d\t", matrix[i][j]);
        }
        printf("\n");
    }
}


int main()
{
     int n;

    printf("Enter the size of matrices (power of 2): ");
    scanf("%d", &n);

    if ((n & (n - 1)) != 0 || n <= 0) {
        printf("Please enter a valid size (power of 2).\n");
        return 1;
    }

    int A[n][n], B[n][n], C[n][n];

    printf("Enter the elements of matrix A:\n");
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            scanf("%d", &A[i][j]);
        }
    }

    printf("Enter the elements of matrix B:\n");
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            scanf("%d", &B[i][j]);
        }
    }

    strassen(n, A, B, C);

    printf("Resultant matrix C:\n");
    printMatrix(n, C);

    return 0;
}