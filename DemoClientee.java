import java.util.Scanner;

public class DemoClientee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente[] c;

        int n;
        String nome;
        float cred;
        float m;

        System.out.print("\nEntre com o número de clientes: ");
        n = sc.nextInt();

        c = new Cliente[n];

        System.out.print("\n=== Entrada de dados ===\n");
        for(int i=0;i<c.length;i++)
            sc.nextLine();
            c[i] = new Cliente();
            System.out.print("\nDados do cliente "+(i+1)+": ");
            System.out.print("\nNome: ");
            nome = sc.nextLine();
            System.out.print("Crédito: ");
            cred = sc.nextFloat();
            c[i].setNome(nome);
            c[i].setCred(cred);
            System.out.print("***\n");
        }
       
        System.out.print("\n=== Dados do primeiro cliente no vetor c ===\n");
        System.out.print(c[0]);
        System.out.print("\n***\n");

        System.out.print("\n=== Maior valor de crédito dos Clientes ===\n");
        m = c[0].getCred();
        for(int i=1;i<c.length;i++)
            if(c[i].getCred() > m)
                m = c[i].getCred();
       
        System.out.print("\nMaior valor de crédito: "+m);
       
        System.out.print("\n\n=== Ordem crescente de créditos dos Clientes ===\n");
        Cliente aux;
        for(int i=0; i<c.length-1; i++)
            for(int j=i+1; j<c.length; j++)
                if(c[i].getCred() > c[j].getCred()) {
                    aux = c[i];
                    c[i] = c[j];
                    c[j] = aux;
                }

        for(int i=0;i<c.length;i++) {
            System.out.print("\nDados do Cliente "+(i+1)+": "+c[i]);
            System.out.print("\n***\n");
        }
       
        sc.close();

        System.out.print("\n\n");
       
    }
}
