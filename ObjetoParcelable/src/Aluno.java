import android.os.Parcel;
import android.os.Parcelable;

//Melhor do que o Serializable porque melhora o desempenho do sistema.
public class Aluno implements Parcelable {
	private static final int TAM = 3;
	private String nome;
	private int fone;
	private String email;
	
	public Aluno(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Aluno(Parcel in){
		String dados[] = new String[TAM];
		in.readStringArray(dados);//guarda o conteúdo dos atributos 
		this.nome = dados[0];
		this.fone = Integer.valueOf(dados[1]);
		this.email = dados[2];
	}
	public int describeContent(){
		return 0;
	}
	
	public void writeToParcel(Parcel dest, int flags){
		dest.writeStringArray(new String[] {this.nome,String.valueOf(this.fone),this.email});
	}
	public static final Parcelable.Creator CREATOR{
	
	new Parcelable.Creator(){
		public Aluno createFrom Parcel(Parcel in){
			return new Aluno(in);
		}
		public Aluno[] newArray(int tam){
			return new Aluno[tam];
		}
	};
	
	
}

