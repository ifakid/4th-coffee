public class AssistantDecoder {
    private Assistant a;
    AssistantDecoder(Assistant assistant) {
        a = assistant;
    }

    public void addPersonToRecommendations(String name) throws Exception {
        Method m = a.getClass().getDeclaredMethod("addPersonToRecommendations", String.class);
        m.setAccessible(true);
        m.invoke(a,name);
    }

    public int getSalary() throws Exception {
        Field f = a.getClass().getDeclaredField("salary");
        f.setAccessible(true);
        return (int)f.get(a);
    }
}