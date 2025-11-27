class ReverseString {

    String reverse(String inputString) {
        String r = "";
        for(int i=0 ; i<inputString.length(); i++){
            r = inputString.charAt(i) + r;
        }
        return r;
    }
  
}
