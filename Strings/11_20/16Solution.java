class Solution {
    public int romanToInt(String s) {
        int len=s.length();
        int sum=0;
        char c='C',d='D',m='M';
        for(int i=0;i<len;i++){
            switch(s.charAt(i)){
                case 'M':
                    if(i!=0&&'C'==s.charAt(i-1)){
                        sum+=800;
                    }else{
                        sum+=1000;
                    }
                    break;
                case 'D':
                    if(i!=0&&'C'==s.charAt(i-1)){
                        sum+=300;
                    }else{
                        sum+=500;
                    }
                    break;
                case 'C':
                    if(i!=0&&'X'==s.charAt(i-1)){
                        sum+=80;
                    }else{
                        sum+=100;
                    }
                    break;
                case 'L':
                    if(i!=0&&'X'==s.charAt(i-1)){
                        sum+=30;
                    }else{
                        sum+=50;
                    }
                    break;
                case 'X':
                    if(i!=0&&'I'==s.charAt(i-1)){
                        sum+=8;
                    }else{
                        sum+=10;
                    }
                    break;
                case 'V':
                    if(i!=0&&'I'==s.charAt(i-1)){
                        sum+=3;
                    }else{
                        sum+=5;
                    }
                    break;
                case 'I':
                    sum+=1;
                    break;
            }
        }
        return sum;
    }
}
