/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author lenovo
 */
public class Model {
    
    
   //Convert functions...
    //Dec
    public String decToBin(String num){
        int num_dec = Integer.parseInt(num);
        int mod;
        int aux = 0;
        String bin = "";
        while(num_dec >0){
            mod = (num_dec%2);
            bin = mod + bin;
            num_dec = num_dec/2;
            aux = aux + 1;
            if(aux == 4){
                bin = " "+bin;
                aux = 0;
            }
        }
        return bin;
    }
    public String decToOct(String num){
        int num_dec = Integer.parseInt(num);
        int mod;
        String oct = "";
        while(num_dec >0){
            mod = (num_dec%8);
            oct = mod + oct;
            num_dec = num_dec/8;
        }
        return oct;
    }
    public String decToHex(String num){
        int num_dec = Integer.parseInt(num);
        int mod;
        String hex = "";
        while(num_dec > 0){
            mod = (num_dec%16);            
            if(mod == 10){
                hex = hex + "A";
            }
            else if(mod == 11){
                hex = hex + "B";
            }
            else if(mod == 12){
                hex = hex + "C";
            }
            else if(mod == 13){
                hex = hex + "D";
            }
            else if(mod == 14){
                hex = hex + "E";
            }
            else if(mod == 15){
                hex = hex + "F";
            }
            else{
                hex = mod + hex;
            }
            num_dec = num_dec/16;            
        }
        return hex;
    }
    //Bin
    public String binToDec(String num){
        int num_bin = Integer.parseInt(num);
        int mod;
        int res = 0, exp = 0;
        String dec = "";
        while(num_bin >0){
            mod = (num_bin%10);
            res = res + (mod*(int)Math.pow(2,exp));
            exp = exp + 1;
            num_bin = num_bin/10;
        }
        return ""+res;
    }
    public String binToOct(String num){
        String bin_to_dec = binToDec(num);
        return decToOct(bin_to_dec);
    }
    public String binToHex(String num){
        String bin_to_dec = binToDec(num);
        return decToHex(bin_to_dec);
    }
    //Oct
    public String octToDec(String num){
        int num_oct = Integer.parseInt(num);
        int mod;
        int res = 0, exp = 0;
        String dec = "";
        while(num_oct >0){
            mod = (num_oct%10);
            res = res + (mod*(int)Math.pow(8,exp));
            exp = exp + 1;
            num_oct = num_oct/10;
        }
        return ""+res;
    }
    public String octToBin(String num){
        String oct_to_dec = octToDec(num);
        return decToBin(oct_to_dec);
    }
    public String octToHex(String num){
        String oct_to_dec = octToDec(num);
        return decToHex(oct_to_dec);
    }
    //Hex
    public String hexToDec(String num){
        long sum = 0;
        StringBuilder hex_num = new StringBuilder(num).reverse();
        
        for(int i=0; i<hex_num.length();i++){
           if(hex_num.charAt(i)=='A'){
              sum = sum +(10*(int)Math.pow(16, i));
           }
           else if(hex_num.charAt(i)=='B'){
              sum = sum +(11*(int)Math.pow(16, i));
           } 
           else if(hex_num.charAt(i)=='C'){
              sum = sum +(12*(int)Math.pow(16, i));
           } 
           else if(hex_num.charAt(i)=='D'){
              sum = sum +(13*(int)Math.pow(16, i));
           } 
           else if(hex_num.charAt(i)=='E'){
              sum = sum +(14*(int)Math.pow(16, i));
           } 
           else if(hex_num.charAt(i)=='F'){
              sum = sum +(15*(int)Math.pow(16, i));
           }
           else{
               sum = sum + Integer.parseInt(""+hex_num.charAt(i))*(int)Math.pow(16, i);
           }
        }
        return ""+sum;
    }
    public String hexToBin(String num){
        String hex_to_dec = hexToDec(num);
        return decToBin(hex_to_dec);
    }
    public String hexToOct(String num){
        String hex_to_dec = hexToDec(num);
        return decToOct(hex_to_dec);
    }
}
