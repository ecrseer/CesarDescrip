package Exemplos;

public class mentris {

    public String mentrik(String ment,float kent){
         ment=ment+" kent eh"+kent*2;

        return ment;
    }

    public String descriptografar(String texto) {
        //throw new UnsupportedOperationException("esse method nao esta implementado aainda");

        texto = texto.toLowerCase();
        for(char cripi=97;cripi<=99; cripi++) {
            texto = texto.replace(cripi, (char)(cripi- 35));

        }

        for (char cripi=100;cripi<=122; cripi++) {

            //System.out.printf("e C eh %c\n", c);
            texto = texto.replace(cripi, (char)(cripi- 35));

        }
        texto = texto.toLowerCase();

        return texto;
    }

    public String criptografar(String texto) {
        //throw new UnsupportedOperationException("esse method nao esta implementado aainda");
        texto = texto.toLowerCase();

        for (char cripi=97; cripi<=119; cripi++){

            //System.out.printf("e C eh %c\n", c);
            texto = texto.replace(cripi, (char)(cripi- 29));

        }
        for  (char cripi=120; cripi<=122; cripi++){
            texto = texto.replace(cripi, (char)(cripi- 55));
        }

        texto = texto.toLowerCase();
       // System.out.println("texto sera "+texto);
        return texto;
    }


}
