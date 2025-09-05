class Solution {
    public int romanToInt(String s) {
        
        int[] values= new int[26];
        values['I'- 'A']=1;
        values['V'- 'A']=5;
        values['X'- 'A']=10;
        values['L'- 'A']=50;
        values['C'- 'A']=100;
        values['D'- 'A']=500;
        values['M'- 'A']=1000;
        int total =0;
        for(int i=0;i< s.length();i++)
        {
    
            int current = values[s.charAt(i)- 'A'];

            if(i+1 < s.length()){
                int next= values[s.charAt(i+1)- 'A'];
                if(current < next){
                total = total-current;
                }else{
                total +=current;
            }


           }else{
            total = total + current;
           }

           
    }

    return total;
}

}