 class Temperature
 {

    public int findNearZero(int[] aTemp)
    {
        int min = aTemp[0];
        for (int i = 0; i < aTemp.length; i++) {

            if (min >= Math.abs(aTemp[i]))
            {
                min = aTemp[i];
            }


        }
        return  min;

    }
        public static void main (String[]args)
        {
            int aTemp[] = {-3,-7, -10, 13, 8, 3};
            Temperature obj=new Temperature();
            System.out.printf("Min value is:" + Math.abs(obj.findNearZero(aTemp)));
        }
    }
