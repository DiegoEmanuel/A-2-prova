public class TestaTribunal {
    
    public static void main(String[] args){
        Servidor boss = new Servidor("Camila");
        
        AssistenteAdm a1 = new AssistenteAdm("Joel", "Champras");
        
        AnalistaTI t1 = new AnalistaTI("Chandler", boss, "Eu nunca");
        
        AnalistaJuridico j1 = new AnalistaJuridico("Bernadete", boss, "penal");
        
        AnalistaAdHoc h1 = new AnalistaAdHoc("Douglas", boss, 10);
        
    }
    
}
