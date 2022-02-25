import java.util.*;
public class Rank {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t != 0){
                int ddsa , dtoc , ddm ;
                int sdsa , stoc , sdm;
                ddsa = sc.nextInt();
                dtoc = sc.nextInt();
                ddm = sc.nextInt();
                sdsa = sc.nextInt();
                stoc = sc.nextInt();
                sdm = sc.nextInt();
                if((ddsa + dtoc + ddm) == (sdsa+stoc+sdm)){
                    if(ddsa == sdsa && dtoc == stoc && ddm == sdm){
                        System.out.println("TIE");
                    }
                    else if(ddsa > sdsa)
                    System.out.println("DRAGON");
                    else if(ddsa < sdsa)
                    System.out.println("SLOTH");
                    else if(dtoc > stoc)
                    System.out.println("DRAGON");
                    else if(dtoc < stoc)
                    System.out.println("SLOTH");
                } 
                else if((ddsa + dtoc + ddm) > (sdsa+stoc+sdm)) System.out.println("DRAGON");
                else if((sdsa+stoc+sdm) > (ddsa + dtoc + ddm)) System.out.println("SLOTH");
                t--;
            }
        }
    }
}
