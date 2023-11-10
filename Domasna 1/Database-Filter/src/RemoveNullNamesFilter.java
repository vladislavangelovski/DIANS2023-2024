public class RemoveNullNamesFilter implements Filter<String>{
    @Override
    public String execute(String input) {
        String[] fields = input.split(",");
        if(fields.length >= 3 && fields[2] != null && !fields[2].isEmpty()){
            return input;
        }
        return null;
    }
}