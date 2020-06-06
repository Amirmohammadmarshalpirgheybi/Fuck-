public class Amir {
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("I am tired");
        System.out.println("go to hell");
        String[] ali=new String[6];
        ali[5]="GO to hell";
        System.out.println("I am no teady");
        System.out.println("WHo are you");
    }
}


class Solve{
    double[] GaussJordanElimination(double[][] A,double[] a,double n){
        double b=0,c=0,d=0,temp;
        for (int i=0;i<n;i++){
            /////////////////////////////          if A[i][i]==0 we should change it with a non zero row
            if(A[i][i]==0){
                b=0;
                for (int l=i+1;l<n;l++){
                    if(A[l][i]!=0){
                        b=1;
                        temp=a[i];
                        a[i]=a[l];
                        a[l]=temp;
                        for (int p=i;p<n;p++){
                            temp=A[i][p];
                            A[i][p]=A[l][p];
                            A[l][p]=temp;
                        }
                        break;
                    }
                }
                if(b==0){
                    return null;
                }
            }
            /////////////////////////////          if A[i][i]==0 we should change it with a non zero row
            /////////////////////////////          making A[i][i]==1
            temp=A[i][i];
            a[i]/=temp;
            for (int k=i;k<n;k++){
                A[i][k]/=temp;
            }
            /////////////////////////////          making A[i][i]==1
            /////////////////////////////          make all entries of a column i th zero except A[i][i] which have to be one
            for (int j=0;j<n;j++){
                if (j==i){
                    continue;
                }
                else {
                    temp=A[j][i];
                    a[j]-=a[i]*temp;
                    for (int k=i;k<n;k++){
                        A[j][k]-=A[i][k]*temp;
                    }
                }
            }
            /////////////////////////////          make all entries of a column zero except A[i][i] which have to be one
        }
        return a;
    }
}