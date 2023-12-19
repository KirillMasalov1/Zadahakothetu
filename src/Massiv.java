public class Massiv {
    public String[] massiv;
    public int numb = 0;

    public Massiv(String[] massiv) {
        this.massiv = massiv;
    }

    public void addelement(String element) {
        boolean flag = true;
        if (massiv.length == numb) {
            System.out.println("Массив полон");
        } else {
            if (numb != 0) {
                for (int i = 0; i < numb; i++) {
                    if (massiv[i].length() > element.length()) {
                        String zap1 = massiv[i];
                        String zap2;
                        for (int x = i + 1; x < numb+1; x++) {
                            zap2 = massiv[x];
                            massiv[x] = zap1;
                            zap1 = zap2;
                        }
                        massiv[i] = element;
                        numb += 1;
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    massiv[numb] = element;
                    numb+=1;
                }
            } else {
                massiv[numb] = element;
                numb+=1;
            }
        }
    }

    public String Maxelement() {
        String max = "";
        for (int i = 0; i < numb; i++) {
            if (massiv[i].length() > max.length()) {
                max = massiv[i];
            }
        }
        return max;
    }

    public void getmassiv() {
        for (int i = 0; i < numb; i++) {
            System.out.println(massiv[i]);
        }
    }

    public double srednee() {
        int znah = 0;
        for (int i = 0; i < numb; i++) {
            znah += massiv[i].length();

        }
        return (znah / numb);
    }
}
