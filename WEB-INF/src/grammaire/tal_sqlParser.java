package grammaire;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "APRES", "ARTICLE", "AVANT", 
		"BULLETIN", "CONJ", "CONTACT", "FIN", "JOUR", "MAIL", "MOIS", "MOT", "NOMBRE", 
		"NUMERO", "OPERATOR", "POINT", "PUBLIR", "RUBRIQUE", "SELECT", "TITRE", 
		"VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int APRES=5;
	public static final int ARTICLE=6;
	public static final int AVANT=7;
	public static final int BULLETIN=8;
	public static final int CONJ=9;
	public static final int CONTACT=10;
	public static final int FIN=11;
	public static final int JOUR=12;
	public static final int MAIL=13;
	public static final int MOIS=14;
	public static final int MOT=15;
	public static final int NOMBRE=16;
	public static final int NUMERO=17;
	public static final int OPERATOR=18;
	public static final int POINT=19;
	public static final int PUBLIR=20;
	public static final int RUBRIQUE=21;
	public static final int SELECT=22;
	public static final int TITRE=23;
	public static final int VAR=24;
	public static final int WS=25;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:69:1: listerequetes returns [String sql = \"\"] : r= requete ( POINT )? ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:70:25: (r= requete ( POINT )? )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:71:3: r= requete ( POINT )?
			{
			pushFollow(FOLLOW_requete_in_listerequetes597);
			r=requete();
			state._fsp--;

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:71:15: ( POINT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==POINT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:71:16: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_listerequetes600); 
					}
					break;

			}


							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:78:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )? ( ( ARTICLE )? | BULLETIN | RUBRIQUE | TITRE | CONTACT | ( NOMBRE ( ARTICLE | RUBRIQUE | BULLETIN ) ) ) ( ( ( MOT | ARTICLE )* (ps= params_mot ) ) | ( TITRE ( MOT )* ps= params_mot ) | ( MOT | PUBLIR )? RUBRIQUE ps= params_rub | ( NUMERO ps= param_num ) | ( ( ARTICLE )? ( PUBLIR )* ( ( AVANT | APRES )? ps= params_date ) ) | ( PUBLIR )* ps= param_email ) ( (ps1= CONJ )? NUMERO ps= param_num )? ( (ps2= CONJ )? ( MOT )* ps= params_mot )? ( (ps3= CONJ )? RUBRIQUE ps= params_rub )? ( (ps4= CONJ )? ( PUBLIR )* ( AVANT | APRES )? ps= params_date )? ( (ps5= CONJ )? ( PUBLIR )+ ps= param_email )? ( (ps6= CONJ )? MOT ps= params_mot )? ( FIN )? ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Token ps1=null;
		Token ps2=null;
		Token ps3=null;
		Token ps4=null;
		Token ps5=null;
		Token ps6=null;
		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:79:26: ( ( SELECT )? ( ( ARTICLE )? | BULLETIN | RUBRIQUE | TITRE | CONTACT | ( NOMBRE ( ARTICLE | RUBRIQUE | BULLETIN ) ) ) ( ( ( MOT | ARTICLE )* (ps= params_mot ) ) | ( TITRE ( MOT )* ps= params_mot ) | ( MOT | PUBLIR )? RUBRIQUE ps= params_rub | ( NUMERO ps= param_num ) | ( ( ARTICLE )? ( PUBLIR )* ( ( AVANT | APRES )? ps= params_date ) ) | ( PUBLIR )* ps= param_email ) ( (ps1= CONJ )? NUMERO ps= param_num )? ( (ps2= CONJ )? ( MOT )* ps= params_mot )? ( (ps3= CONJ )? RUBRIQUE ps= params_rub )? ( (ps4= CONJ )? ( PUBLIR )* ( AVANT | APRES )? ps= params_date )? ( (ps5= CONJ )? ( PUBLIR )+ ps= param_email )? ( (ps6= CONJ )? MOT ps= params_mot )? ( FIN )? )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:80:3: ( SELECT )? ( ( ARTICLE )? | BULLETIN | RUBRIQUE | TITRE | CONTACT | ( NOMBRE ( ARTICLE | RUBRIQUE | BULLETIN ) ) ) ( ( ( MOT | ARTICLE )* (ps= params_mot ) ) | ( TITRE ( MOT )* ps= params_mot ) | ( MOT | PUBLIR )? RUBRIQUE ps= params_rub | ( NUMERO ps= param_num ) | ( ( ARTICLE )? ( PUBLIR )* ( ( AVANT | APRES )? ps= params_date ) ) | ( PUBLIR )* ps= param_email ) ( (ps1= CONJ )? NUMERO ps= param_num )? ( (ps2= CONJ )? ( MOT )* ps= params_mot )? ( (ps3= CONJ )? RUBRIQUE ps= params_rub )? ( (ps4= CONJ )? ( PUBLIR )* ( AVANT | APRES )? ps= params_date )? ( (ps5= CONJ )? ( PUBLIR )+ ps= param_email )? ( (ps6= CONJ )? MOT ps= params_mot )? ( FIN )?
			{
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:80:3: ( SELECT )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SELECT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:80:4: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete630); 
					}
					break;

			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:82:3: ( ( ARTICLE )? | BULLETIN | RUBRIQUE | TITRE | CONTACT | ( NOMBRE ( ARTICLE | RUBRIQUE | BULLETIN ) ) )
			int alt5=6;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:82:4: ( ARTICLE )?
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:82:4: ( ARTICLE )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==ARTICLE) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:82:5: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete641); 
							}
							break;

					}


								req_arbre.ajouteFils(new Arbre("","select distinct"));
								req_arbre.ajouteFils(new Arbre("","fichier"));
								
					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:87:6: BULLETIN
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete655); 

								req_arbre.ajouteFils(new Arbre("","select distinct"));
								req_arbre.ajouteFils(new Arbre("","bulletin"));
								
					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:92:6: RUBRIQUE
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete667); 

							          req_arbre.ajouteFils(new Arbre("","select distinct"));
							          req_arbre.ajouteFils(new Arbre("","rubrique"));
							         
					}
					break;
				case 4 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:97:6: TITRE
					{
					match(input,TITRE,FOLLOW_TITRE_in_requete687); 

							         req_arbre.ajouteFils(new Arbre("","select distinct"));
							          req_arbre.ajouteFils(new Arbre("","titre"));
							         
					}
					break;
				case 5 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:102:6: CONTACT
					{
					match(input,CONTACT,FOLLOW_CONTACT_in_requete707); 

							          req_arbre.ajouteFils(new Arbre("","select distinct"));
							          req_arbre.ajouteFils(new Arbre("","email"));
							       
					}
					break;
				case 6 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:108:6: ( NOMBRE ( ARTICLE | RUBRIQUE | BULLETIN ) )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:108:6: ( NOMBRE ( ARTICLE | RUBRIQUE | BULLETIN ) )
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:108:7: NOMBRE ( ARTICLE | RUBRIQUE | BULLETIN )
					{
					match(input,NOMBRE,FOLLOW_NOMBRE_in_requete736); 

								req_arbre.ajouteFils(new Arbre("","select count("));
								
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:112:10: ( ARTICLE | RUBRIQUE | BULLETIN )
					int alt4=3;
					switch ( input.LA(1) ) {
					case ARTICLE:
						{
						alt4=1;
						}
						break;
					case RUBRIQUE:
						{
						alt4=2;
						}
						break;
					case BULLETIN:
						{
						alt4=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:112:11: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete760); 

										    req_arbre.ajouteFils(new Arbre("","fichier"));
										    req_arbre.ajouteFils(new Arbre("",")"));
										   
							}
							break;
						case 2 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:117:13: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete781); 

									          req_arbre.ajouteFils(new Arbre("","rubrique"));
									          req_arbre.ajouteFils(new Arbre("",")"));
									            
							}
							break;
						case 3 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:122:13: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete810); 

										       req_arbre.ajouteFils(new Arbre("","bulletin"));
										       req_arbre.ajouteFils(new Arbre("",")"));
										      
							}
							break;

					}

					}

					}
					break;

			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:132:4: ( ( ( MOT | ARTICLE )* (ps= params_mot ) ) | ( TITRE ( MOT )* ps= params_mot ) | ( MOT | PUBLIR )? RUBRIQUE ps= params_rub | ( NUMERO ps= param_num ) | ( ( ARTICLE )? ( PUBLIR )* ( ( AVANT | APRES )? ps= params_date ) ) | ( PUBLIR )* ps= param_email )
			int alt13=6;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:132:6: ( ( MOT | ARTICLE )* (ps= params_mot ) )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:132:6: ( ( MOT | ARTICLE )* (ps= params_mot ) )
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:132:8: ( MOT | ARTICLE )* (ps= params_mot )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:132:8: ( MOT | ARTICLE )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ARTICLE||LA6_0==MOT) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:
							{
							if ( input.LA(1)==ARTICLE||input.LA(1)==MOT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}


									req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:137:8: (ps= params_mot )
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:137:9: ps= params_mot
					{
					pushFollow(FOLLOW_params_mot_in_requete893);
					ps=params_mot();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:144:9: ( TITRE ( MOT )* ps= params_mot )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:144:9: ( TITRE ( MOT )* ps= params_mot )
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:144:10: TITRE ( MOT )* ps= params_mot
					{
					match(input,TITRE,FOLLOW_TITRE_in_requete931); 

									req_arbre.ajouteFils(new Arbre("","from titre"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:149:10: ( MOT )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==MOT) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:149:11: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_requete948); 
							}
							break;

						default :
							break loop7;
						}
					}

					pushFollow(FOLLOW_params_mot_in_requete965);
					ps=params_mot();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}

					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:156:10: ( MOT | PUBLIR )? RUBRIQUE ps= params_rub
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:156:10: ( MOT | PUBLIR )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==MOT||LA8_0==PUBLIR) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:
							{
							if ( input.LA(1)==MOT||input.LA(1)==PUBLIR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1001); 

							                req_arbre.ajouteFils(new Arbre("","from titretexte"));
									req_arbre.ajouteFils(new Arbre("","where"));
							         
					pushFollow(FOLLOW_params_rub_in_requete1030);
					ps=params_rub();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 4 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:167:11: ( NUMERO ps= param_num )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:167:11: ( NUMERO ps= param_num )
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:167:12: NUMERO ps= param_num
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_requete1059); 

							                req_arbre.ajouteFils(new Arbre("","from numero"));
									req_arbre.ajouteFils(new Arbre("","where"));
							         
					pushFollow(FOLLOW_param_num_in_requete1088);
					ps=param_num();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								 
					}

					}
					break;
				case 5 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:178:10: ( ( ARTICLE )? ( PUBLIR )* ( ( AVANT | APRES )? ps= params_date ) )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:178:10: ( ( ARTICLE )? ( PUBLIR )* ( ( AVANT | APRES )? ps= params_date ) )
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:178:13: ( ARTICLE )? ( PUBLIR )* ( ( AVANT | APRES )? ps= params_date )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:178:13: ( ARTICLE )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ARTICLE) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:178:14: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1120); 
							}
							break;

					}

					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:178:24: ( PUBLIR )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==PUBLIR) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:178:25: PUBLIR
							{
							match(input,PUBLIR,FOLLOW_PUBLIR_in_requete1125); 
							}
							break;

						default :
							break loop10;
						}
					}

					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:179:13: ( ( AVANT | APRES )? ps= params_date )
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:179:14: ( AVANT | APRES )? ps= params_date
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:179:14: ( AVANT | APRES )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==APRES||LA11_0==AVANT) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:
							{
							if ( input.LA(1)==APRES||input.LA(1)==AVANT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_params_date_in_requete1154);
					ps=params_date();
					state._fsp--;


							                req_arbre.ajouteFils(new Arbre("","from datemoisenlettres"));
									req_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								      
					}

					}

					}
					break;
				case 6 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:188:10: ( PUBLIR )* ps= param_email
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:188:10: ( PUBLIR )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==PUBLIR) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:188:11: PUBLIR
							{
							match(input,PUBLIR,FOLLOW_PUBLIR_in_requete1202); 
							}
							break;

						default :
							break loop12;
						}
					}

					pushFollow(FOLLOW_param_email_in_requete1208);
					ps=param_email();
					state._fsp--;


							                req_arbre.ajouteFils(new Arbre("","from email"));
									req_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);   
							                  
					}
					break;

			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:197:8: ( (ps1= CONJ )? NUMERO ps= param_num )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CONJ) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==NUMERO) ) {
					alt15=1;
				}
			}
			else if ( (LA15_0==NUMERO) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:197:11: (ps1= CONJ )? NUMERO ps= param_num
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:197:11: (ps1= CONJ )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==CONJ) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:197:12: ps1= CONJ
							{
							ps1=(Token)match(input,CONJ,FOLLOW_CONJ_in_requete1266); 
							}
							break;

					}

					match(input,NUMERO,FOLLOW_NUMERO_in_requete1270); 
					 
							           	if (ps1!= null && ps1.getText().equals("ou")) {
										req_arbre.ajouteFils(new Arbre("", "OR"));
									}
									else if (ps1 != null && ps1.getText().equals("sans")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								        }
								        else if (ps1!= null && ps1.getText().equals("pas")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								         }
									else {
									       req_arbre.ajouteFils(new Arbre("", "AND"));
									 }
							         
					pushFollow(FOLLOW_param_num_in_requete1301);
					ps=param_num();
					state._fsp--;

					  	  
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								 
					}
					break;

			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:220:8: ( (ps2= CONJ )? ( MOT )* ps= params_mot )?
			int alt18=2;
			switch ( input.LA(1) ) {
				case CONJ:
					{
					int LA18_1 = input.LA(2);
					if ( (LA18_1==MOT) ) {
						int LA18_2 = input.LA(3);
						if ( (LA18_2==MOT||LA18_2==VAR) ) {
							alt18=1;
						}
					}
					else if ( (LA18_1==VAR) ) {
						alt18=1;
					}
					}
					break;
				case MOT:
					{
					int LA18_2 = input.LA(2);
					if ( (LA18_2==MOT||LA18_2==VAR) ) {
						alt18=1;
					}
					}
					break;
				case VAR:
					{
					alt18=1;
					}
					break;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:220:9: (ps2= CONJ )? ( MOT )* ps= params_mot
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:220:9: (ps2= CONJ )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==CONJ) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:220:10: ps2= CONJ
							{
							ps2=(Token)match(input,CONJ,FOLLOW_CONJ_in_requete1348); 
							}
							break;

					}

					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:221:10: ( MOT )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==MOT) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:221:11: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_requete1363); 
							}
							break;

						default :
							break loop17;
						}
					}


							            if (ps2!= null && ps2.getText().equals("ou")) {
										req_arbre.ajouteFils(new Arbre("", "OR"));
									}
									else if (ps2 != null && ps2.getText().equals("sans")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								        }
								        else if (ps2!= null && ps2.getText().equals("pas")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								         }
									else {
									       req_arbre.ajouteFils(new Arbre("", "AND"));
									 }
							           
					pushFollow(FOLLOW_params_mot_in_requete1393);
					ps=params_mot();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;

			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:243:8: ( (ps3= CONJ )? RUBRIQUE ps= params_rub )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==CONJ) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==RUBRIQUE) ) {
					alt20=1;
				}
			}
			else if ( (LA20_0==RUBRIQUE) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:243:9: (ps3= CONJ )? RUBRIQUE ps= params_rub
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:243:9: (ps3= CONJ )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==CONJ) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:243:10: ps3= CONJ
							{
							ps3=(Token)match(input,CONJ,FOLLOW_CONJ_in_requete1431); 
							}
							break;

					}

					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1435); 

							        if (ps3!= null && ps3.getText().equals("ou")) {
										req_arbre.ajouteFils(new Arbre("", "OR"));
									}
									else if (ps3!= null && ps3.getText().equals("sans")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								        }
								        else if (ps3!= null && ps3.getText().equals("pas")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								         }
									else {
									       req_arbre.ajouteFils(new Arbre("", "AND"));
									 }
							        
					pushFollow(FOLLOW_params_rub_in_requete1465);
					ps=params_rub();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;

			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:266:10: ( (ps4= CONJ )? ( PUBLIR )* ( AVANT | APRES )? ps= params_date )?
			int alt24=2;
			alt24 = dfa24.predict(input);
			switch (alt24) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:266:11: (ps4= CONJ )? ( PUBLIR )* ( AVANT | APRES )? ps= params_date
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:266:11: (ps4= CONJ )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==CONJ) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:266:12: ps4= CONJ
							{
							ps4=(Token)match(input,CONJ,FOLLOW_CONJ_in_requete1523); 
							}
							break;

					}

					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:266:23: ( PUBLIR )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==PUBLIR) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:266:24: PUBLIR
							{
							match(input,PUBLIR,FOLLOW_PUBLIR_in_requete1528); 
							}
							break;

						default :
							break loop22;
						}
					}

					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:266:33: ( AVANT | APRES )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==APRES||LA23_0==AVANT) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:
							{
							if ( input.LA(1)==APRES||input.LA(1)==AVANT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}


							         if (ps4!= null && ps4.getText().equals("ou")) {
										req_arbre.ajouteFils(new Arbre("", "OR"));
									}
									else if (ps4!= null && ps4.getText().equals("sans")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								        }
								        else if (ps4!= null && ps4.getText().equals("pas")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								         }
									else {
									       req_arbre.ajouteFils(new Arbre("", "AND"));
									 }
							        
					pushFollow(FOLLOW_params_date_in_requete1571);
					ps=params_date();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								      
					}
					break;

			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:288:4: ( (ps5= CONJ )? ( PUBLIR )+ ps= param_email )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==CONJ) ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1==PUBLIR) ) {
					alt27=1;
				}
			}
			else if ( (LA27_0==PUBLIR) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:288:5: (ps5= CONJ )? ( PUBLIR )+ ps= param_email
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:288:5: (ps5= CONJ )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==CONJ) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:288:6: ps5= CONJ
							{
							ps5=(Token)match(input,CONJ,FOLLOW_CONJ_in_requete1610); 
							}
							break;

					}

					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:288:16: ( PUBLIR )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==PUBLIR) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:288:17: PUBLIR
							{
							match(input,PUBLIR,FOLLOW_PUBLIR_in_requete1614); 
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}


								 if (ps5!= null && ps5.getText().equals("ou")) {
										req_arbre.ajouteFils(new Arbre("", "OR"));
									}
									else if (ps5!= null && ps5.getText().equals("sans")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								        }
								        else if (ps5!= null && ps5.getText().equals("pas")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								         }
									else {
									       req_arbre.ajouteFils(new Arbre("", "AND"));
									 }
								 
					pushFollow(FOLLOW_param_email_in_requete1629);
					ps=param_email();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);   
							                  
					}
					break;

			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:310:10: ( (ps6= CONJ )? MOT ps= params_mot )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==CONJ||LA29_0==MOT) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:310:12: (ps6= CONJ )? MOT ps= params_mot
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:310:12: (ps6= CONJ )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==CONJ) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:310:13: ps6= CONJ
							{
							ps6=(Token)match(input,CONJ,FOLLOW_CONJ_in_requete1689); 
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete1693); 

							        if (ps6!= null && ps6.getText().equals("ou")) {
										req_arbre.ajouteFils(new Arbre("", "OR"));
									}
									else if (ps6!= null && ps6.getText().equals("sans")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								        }
								        else if (ps6!= null && ps6.getText().equals("pas")){			  
									        req_arbre.ajouteFils(new Arbre("", "NOT"));
								         }
									else {
									       req_arbre.ajouteFils(new Arbre("", "AND"));
									 }
							          
					pushFollow(FOLLOW_params_mot_in_requete1724);
					ps=params_mot();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								    
					}
					break;

			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:332:11: ( FIN )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==FIN) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:332:12: FIN
					{
					match(input,FIN,FOLLOW_FIN_in_requete1765); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params_mot"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:335:1: params_mot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( (conj= CONJ )? par2= param )* ;
	public final Arbre params_mot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token conj=null;
		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:336:40: (par1= param ( (conj= CONJ )? par2= param )* )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:337:3: par1= param ( (conj= CONJ )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params_mot1796);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:342:3: ( (conj= CONJ )? par2= param )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==CONJ) ) {
					int LA32_1 = input.LA(2);
					if ( (LA32_1==VAR) ) {
						alt32=1;
					}

				}
				else if ( (LA32_0==VAR) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:342:4: (conj= CONJ )? par2= param
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:342:4: (conj= CONJ )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==CONJ) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:342:5: conj= CONJ
							{
							conj=(Token)match(input,CONJ,FOLLOW_CONJ_in_params_mot1812); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params_mot1820);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									
									if (conj != null && conj.getText().equals("ou")) {
										les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									}
									else if (conj != null && conj.getText().equals("sans")){			  
									        les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
								        }
								        else if (conj != null && conj.getText().equals("pas")){			  
									        les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
								         }
									else {
									    les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									 }
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop32;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_mot"



	// $ANTLR start "param"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:363:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:363:51: (a= VAR )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:364:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param1850); 
			 
					   lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
					  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"



	// $ANTLR start "params_date"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:371:1: params_date returns [Arbre les_pars_arbre = new Arbre(\"\")] : ( ( (par3= param_jour )? par1= param_mois par2= param_annee ) | (par1= param_mois |par2= param_annee ) );
	public final Arbre params_date() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par3 =null;
		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre,par3_arbre;
		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:372:51: ( ( (par3= param_jour )? par1= param_mois par2= param_annee ) | (par1= param_mois |par2= param_annee ) )
			int alt35=2;
			switch ( input.LA(1) ) {
			case JOUR:
				{
				alt35=1;
				}
				break;
			case MOIS:
				{
				int LA35_2 = input.LA(2);
				if ( (LA35_2==ANNEE) ) {
					alt35=1;
				}
				else if ( (LA35_2==EOF||LA35_2==APRES||LA35_2==AVANT||LA35_2==CONJ||(LA35_2 >= FIN && LA35_2 <= JOUR)||(LA35_2 >= MOIS && LA35_2 <= MOT)||LA35_2==NUMERO||(LA35_2 >= POINT && LA35_2 <= RUBRIQUE)||LA35_2==VAR) ) {
					alt35=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ANNEE:
				{
				alt35=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:373:3: ( (par3= param_jour )? par1= param_mois par2= param_annee )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:373:3: ( (par3= param_jour )? par1= param_mois par2= param_annee )
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:374:4: (par3= param_jour )? par1= param_mois par2= param_annee
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:374:4: (par3= param_jour )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==JOUR) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:374:5: par3= param_jour
							{
							pushFollow(FOLLOW_param_jour_in_params_date1887);
							par3=param_jour();
							state._fsp--;


								                par3_arbre = par3;
										les_pars_arbre.ajouteFils(par3_arbre);
										les_pars_arbre.ajouteFils(new Arbre("", "AND"));
								        
							}
							break;

					}

					pushFollow(FOLLOW_param_mois_in_params_date1906);
					par1=param_mois();
					state._fsp--;


								par1_arbre = par1;
								les_pars_arbre.ajouteFils(par1_arbre);
								 les_pars_arbre.ajouteFils(new Arbre("", "AND"));
							
					pushFollow(FOLLOW_param_annee_in_params_date1917);
					par2=param_annee();
					state._fsp--;


						                par2_arbre = par2;
								les_pars_arbre.ajouteFils(par2_arbre);
						   
					}

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:391:6: (par1= param_mois |par2= param_annee )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:391:6: (par1= param_mois |par2= param_annee )
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==MOIS) ) {
						alt34=1;
					}
					else if ( (LA34_0==ANNEE) ) {
						alt34=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}

					switch (alt34) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:392:5: par1= param_mois
							{
							pushFollow(FOLLOW_param_mois_in_params_date1942);
							par1=param_mois();
							state._fsp--;


										par1_arbre = par1;
										les_pars_arbre.ajouteFils(par1_arbre);
									
							}
							break;
						case 2 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:397:6: par2= param_annee
							{
							pushFollow(FOLLOW_param_annee_in_params_date1956);
							par2=param_annee();
							state._fsp--;


								                par2_arbre = par2;
										les_pars_arbre.ajouteFils(par2_arbre);
								       
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_date"



	// $ANTLR start "param_mois"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:404:1: param_mois returns [Arbre lepar_arbre = new Arbre(\"\")] : a= MOIS ;
	public final Arbre param_mois() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:404:56: (a= MOIS )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:405:2: a= MOIS
			{
			a=(Token)match(input,MOIS,FOLLOW_MOIS_in_param_mois1984); 
			 
					   lepar_arbre.ajouteFils(new Arbre("mois =", "'"+a.getText()+"'"));
					  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_mois"



	// $ANTLR start "param_annee"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:411:1: param_annee returns [Arbre lepar_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre param_annee() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:411:57: (a= ANNEE )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:412:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_param_annee2006); 
			 
					   lepar_arbre.ajouteFils(new Arbre("annee =", "'"+a.getText()+"'"));
					  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_annee"



	// $ANTLR start "param_jour"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:418:1: param_jour returns [Arbre lepar_arbre = new Arbre(\"\")] : a= JOUR ;
	public final Arbre param_jour() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:418:56: (a= JOUR )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:419:2: a= JOUR
			{
			a=(Token)match(input,JOUR,FOLLOW_JOUR_in_param_jour2028); 
			 
					   lepar_arbre.ajouteFils(new Arbre("jour =", "'"+a.getText()+"'"));
					  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_jour"



	// $ANTLR start "params_rub"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:426:1: params_rub returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_rub ( (conj= CONJ )? par2= param_rub )* ;
	public final Arbre params_rub() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token conj=null;
		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:427:48: (par1= param_rub ( (conj= CONJ )? par2= param_rub )* )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:428:4: par1= param_rub ( (conj= CONJ )? par2= param_rub )*
			{
			pushFollow(FOLLOW_param_rub_in_params_rub2066);
			par1=param_rub();
			state._fsp--;

			   par1_arbre = par1;
					    les_pars_arbre.ajouteFils(par1_arbre);
					  
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:432:8: ( (conj= CONJ )? par2= param_rub )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==CONJ) ) {
					int LA37_1 = input.LA(2);
					if ( (LA37_1==VAR) ) {
						alt37=1;
					}

				}
				else if ( (LA37_0==VAR) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:432:9: (conj= CONJ )? par2= param_rub
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:432:9: (conj= CONJ )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==CONJ) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:432:10: conj= CONJ
							{
							conj=(Token)match(input,CONJ,FOLLOW_CONJ_in_params_rub2086); 
							}
							break;

					}

					pushFollow(FOLLOW_param_rub_in_params_rub2094);
					par2=param_rub();
					state._fsp--;


									par2_arbre = par2;
									if (conj != null && conj.getText().equals("ou")) {
										les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									}
									else if (conj != null && conj.getText().equals("sans")){			  
									        les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
								        }
								        else if (conj != null && conj.getText().equals("pas")){			  
									        les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
								         }
									else {
									    les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									 }
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop37;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_rub"



	// $ANTLR start "param_rub"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:452:1: param_rub returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param_rub() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:452:55: (a= VAR )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:453:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param_rub2122); 
			 
			            lepar_arbre.ajouteFils(new Arbre("LOWER(rubrique) =", "'"+a.getText()+"'"));
				  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_rub"



	// $ANTLR start "param_num"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:460:1: param_num returns [Arbre les_pars_arbre = new Arbre(\"\")] : (op= OPERATOR )? a= VAR ;
	public final Arbre param_num() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token op=null;
		Token a=null;

		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:460:57: ( (op= OPERATOR )? a= VAR )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:461:2: (op= OPERATOR )? a= VAR
			{
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:461:2: (op= OPERATOR )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==OPERATOR) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:461:3: op= OPERATOR
					{
					op=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_param_num2147); 
					}
					break;

			}

			a=(Token)match(input,VAR,FOLLOW_VAR_in_param_num2154); 
			 
					if(op != null && op.getText().equals("inférieur"))
					   {
					   les_pars_arbre.ajouteFils(new Arbre("numero <", "'"+a.getText()+"'"));
					   }
					else if( op != null && op.getText().equals("supérieur"))
					   {
					    les_pars_arbre.ajouteFils(new Arbre("numero >", "'"+a.getText()+"'"));
					     }
					else{
					   les_pars_arbre.ajouteFils(new Arbre("numero =", "'"+a.getText()+"'"));
					  }
				      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "param_num"



	// $ANTLR start "param_email"
	// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:478:1: param_email returns [Arbre lepar_arbre = new Arbre(\"\")] : a= MAIL ;
	public final Arbre param_email() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:478:57: (a= MAIL )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:479:2: a= MAIL
			{
			a=(Token)match(input,MAIL,FOLLOW_MAIL_in_param_email2179); 
			 
			            lepar_arbre.ajouteFils(new Arbre("email =", "'"+a.getText()+"'"));
				  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_email"

	// Delegated rules


	protected DFA5 dfa5 = new DFA5(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA24 dfa24 = new DFA24(this);
	static final String DFA5_eotS =
		"\15\uffff";
	static final String DFA5_eofS =
		"\15\uffff";
	static final String DFA5_minS =
		"\1\4\1\uffff\2\4\3\uffff\1\6\4\uffff\1\6";
	static final String DFA5_maxS =
		"\1\30\1\uffff\2\30\3\uffff\1\30\4\uffff\1\30";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\1\5\1\6\1\uffff\1\1\1\4\1\1\1\3\1\uffff";
	static final String DFA5_specialS =
		"\15\uffff}>";
	static final String[] DFA5_transitionS = {
			"\4\1\1\4\1\uffff\1\5\1\uffff\4\1\1\6\1\1\2\uffff\1\1\1\3\1\uffff\1\2"+
			"\1\1",
			"",
			"\4\11\4\uffff\3\11\1\7\1\uffff\1\11\2\uffff\2\11\1\uffff\1\11\1\10",
			"\4\13\4\uffff\4\13\1\uffff\1\13\2\uffff\2\13\1\uffff\1\13\1\12",
			"",
			"",
			"",
			"\1\11\10\uffff\1\14\5\uffff\1\11\2\uffff\1\10",
			"",
			"",
			"",
			"",
			"\1\11\10\uffff\1\14\10\uffff\1\10"
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "82:3: ( ( ARTICLE )? | BULLETIN | RUBRIQUE | TITRE | CONTACT | ( NOMBRE ( ARTICLE | RUBRIQUE | BULLETIN ) ) )";
		}
	}

	static final String DFA13_eotS =
		"\13\uffff";
	static final String DFA13_eofS =
		"\13\uffff";
	static final String DFA13_minS =
		"\1\4\1\6\2\uffff\2\4\4\uffff\1\4";
	static final String DFA13_maxS =
		"\2\30\2\uffff\1\30\1\25\4\uffff\1\24";
	static final String DFA13_acceptS =
		"\2\uffff\1\1\1\2\2\uffff\1\3\1\4\1\5\1\6\1\uffff";
	static final String DFA13_specialS =
		"\13\uffff}>";
	static final String[] DFA13_transitionS = {
			"\2\10\1\4\1\10\4\uffff\1\10\1\11\1\10\1\1\1\uffff\1\7\2\uffff\1\5\1\6"+
			"\1\uffff\1\3\1\2",
			"\1\2\10\uffff\1\2\5\uffff\1\6\2\uffff\1\2",
			"",
			"",
			"\2\10\1\2\1\10\4\uffff\1\10\1\uffff\1\10\1\2\4\uffff\1\10\3\uffff\1"+
			"\2",
			"\2\10\1\uffff\1\10\4\uffff\1\10\1\11\1\10\5\uffff\1\12\1\6",
			"",
			"",
			"",
			"",
			"\2\10\1\uffff\1\10\4\uffff\1\10\1\11\1\10\5\uffff\1\12"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "132:4: ( ( ( MOT | ARTICLE )* (ps= params_mot ) ) | ( TITRE ( MOT )* ps= params_mot ) | ( MOT | PUBLIR )? RUBRIQUE ps= params_rub | ( NUMERO ps= param_num ) | ( ( ARTICLE )? ( PUBLIR )* ( ( AVANT | APRES )? ps= params_date ) ) | ( PUBLIR )* ps= param_email )";
		}
	}

	static final String DFA24_eotS =
		"\5\uffff";
	static final String DFA24_eofS =
		"\1\4\4\uffff";
	static final String DFA24_minS =
		"\3\4\2\uffff";
	static final String DFA24_maxS =
		"\3\24\2\uffff";
	static final String DFA24_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA24_specialS =
		"\5\uffff}>";
	static final String[] DFA24_transitionS = {
			"\2\3\1\uffff\1\3\1\uffff\1\1\1\uffff\1\4\1\3\1\uffff\1\3\1\4\3\uffff"+
			"\1\4\1\2",
			"\2\3\1\uffff\1\3\4\uffff\1\3\1\uffff\1\3\1\4\4\uffff\1\2",
			"\2\3\1\uffff\1\3\4\uffff\1\3\1\4\1\3\5\uffff\1\2",
			"",
			""
	};

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	protected class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}
		@Override
		public String getDescription() {
			return "266:10: ( (ps4= CONJ )? ( PUBLIR )* ( AVANT | APRES )? ps= params_date )?";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes597 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_POINT_in_listerequetes600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete630 = new BitSet(new long[]{0x0000000001B3F5F0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete641 = new BitSet(new long[]{0x0000000001B2F0F0L});
	public static final BitSet FOLLOW_BULLETIN_in_requete655 = new BitSet(new long[]{0x0000000001B2F0F0L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete667 = new BitSet(new long[]{0x0000000001B2F0F0L});
	public static final BitSet FOLLOW_TITRE_in_requete687 = new BitSet(new long[]{0x0000000001B2F0F0L});
	public static final BitSet FOLLOW_CONTACT_in_requete707 = new BitSet(new long[]{0x0000000001B2F0F0L});
	public static final BitSet FOLLOW_NOMBRE_in_requete736 = new BitSet(new long[]{0x0000000000200140L});
	public static final BitSet FOLLOW_ARTICLE_in_requete760 = new BitSet(new long[]{0x0000000001B2F0F0L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete781 = new BitSet(new long[]{0x0000000001B2F0F0L});
	public static final BitSet FOLLOW_BULLETIN_in_requete810 = new BitSet(new long[]{0x0000000001B2F0F0L});
	public static final BitSet FOLLOW_params_mot_in_requete893 = new BitSet(new long[]{0x000000000132DAB2L});
	public static final BitSet FOLLOW_TITRE_in_requete931 = new BitSet(new long[]{0x0000000001008000L});
	public static final BitSet FOLLOW_MOT_in_requete948 = new BitSet(new long[]{0x0000000001008000L});
	public static final BitSet FOLLOW_params_mot_in_requete965 = new BitSet(new long[]{0x000000000132DAB2L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1001 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_rub_in_requete1030 = new BitSet(new long[]{0x000000000132DAB2L});
	public static final BitSet FOLLOW_NUMERO_in_requete1059 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_param_num_in_requete1088 = new BitSet(new long[]{0x000000000132DAB2L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1120 = new BitSet(new long[]{0x00000000001050B0L});
	public static final BitSet FOLLOW_PUBLIR_in_requete1125 = new BitSet(new long[]{0x00000000001050B0L});
	public static final BitSet FOLLOW_params_date_in_requete1154 = new BitSet(new long[]{0x000000000132DAB2L});
	public static final BitSet FOLLOW_PUBLIR_in_requete1202 = new BitSet(new long[]{0x0000000000102000L});
	public static final BitSet FOLLOW_param_email_in_requete1208 = new BitSet(new long[]{0x000000000132DAB2L});
	public static final BitSet FOLLOW_CONJ_in_requete1266 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NUMERO_in_requete1270 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_param_num_in_requete1301 = new BitSet(new long[]{0x000000000130DAB2L});
	public static final BitSet FOLLOW_CONJ_in_requete1348 = new BitSet(new long[]{0x0000000001008000L});
	public static final BitSet FOLLOW_MOT_in_requete1363 = new BitSet(new long[]{0x0000000001008000L});
	public static final BitSet FOLLOW_params_mot_in_requete1393 = new BitSet(new long[]{0x000000000030DAB2L});
	public static final BitSet FOLLOW_CONJ_in_requete1431 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1435 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_rub_in_requete1465 = new BitSet(new long[]{0x000000000010DAB2L});
	public static final BitSet FOLLOW_CONJ_in_requete1523 = new BitSet(new long[]{0x00000000001050B0L});
	public static final BitSet FOLLOW_PUBLIR_in_requete1528 = new BitSet(new long[]{0x00000000001050B0L});
	public static final BitSet FOLLOW_params_date_in_requete1571 = new BitSet(new long[]{0x0000000000108A02L});
	public static final BitSet FOLLOW_CONJ_in_requete1610 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PUBLIR_in_requete1614 = new BitSet(new long[]{0x0000000000102000L});
	public static final BitSet FOLLOW_param_email_in_requete1629 = new BitSet(new long[]{0x0000000000008A02L});
	public static final BitSet FOLLOW_CONJ_in_requete1689 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOT_in_requete1693 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_params_mot_in_requete1724 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_FIN_in_requete1765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params_mot1796 = new BitSet(new long[]{0x0000000001000202L});
	public static final BitSet FOLLOW_CONJ_in_params_mot1812 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_in_params_mot1820 = new BitSet(new long[]{0x0000000001000202L});
	public static final BitSet FOLLOW_VAR_in_param1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_jour_in_params_date1887 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_param_mois_in_params_date1906 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_param_annee_in_params_date1917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_mois_in_params_date1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_annee_in_params_date1956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_param_mois1984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_param_annee2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_param_jour2028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_rub_in_params_rub2066 = new BitSet(new long[]{0x0000000001000202L});
	public static final BitSet FOLLOW_CONJ_in_params_rub2086 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_param_rub_in_params_rub2094 = new BitSet(new long[]{0x0000000001000202L});
	public static final BitSet FOLLOW_VAR_in_param_rub2122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATOR_in_param_num2147 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_param_num2154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIL_in_param_email2179 = new BitSet(new long[]{0x0000000000000002L});
}
