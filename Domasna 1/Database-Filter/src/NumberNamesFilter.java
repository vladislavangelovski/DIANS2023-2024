public class NumberNamesFilter implements Filter<String>
{
    @Override
    public String execute(String input) {
        if(input==null) return null;
        String[] fields = input.split(",");
        if(Character.isDigit(fields[2].charAt(0))||Character.isDigit(fields[2].charAt(1))){
            return null;
        }
        else return input;
    }
}