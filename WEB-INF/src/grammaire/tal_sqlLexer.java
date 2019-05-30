package grammaire;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:8: ( 'vouloir' | 'veux' | 'voulais' | 'cherch' | 'souhait' | 'aimerait' | 'd��sire' | 'voudrais' | 'affich' | 'donne' | 'trouver' | 'retourner' | 'voulons' | 'recherch' )
			int alt1=14;
			switch ( input.LA(1) ) {
			case 'v':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='o') ) {
					int LA1_8 = input.LA(3);
					if ( (LA1_8=='u') ) {
						int LA1_15 = input.LA(4);
						if ( (LA1_15=='l') ) {
							int LA1_18 = input.LA(5);
							if ( (LA1_18=='o') ) {
								int LA1_20 = input.LA(6);
								if ( (LA1_20=='i') ) {
									alt1=1;
								}
								else if ( (LA1_20=='n') ) {
									alt1=13;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 1, 20, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA1_18=='a') ) {
								alt1=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 18, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA1_15=='d') ) {
							alt1=8;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 15, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA1_1=='e') ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'c':
				{
				alt1=4;
				}
				break;
			case 's':
				{
				alt1=5;
				}
				break;
			case 'a':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='i') ) {
					alt1=6;
				}
				else if ( (LA1_4=='f') ) {
					alt1=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				int LA1_5 = input.LA(2);
				if ( (LA1_5=='\u00E9') ) {
					alt1=7;
				}
				else if ( (LA1_5=='o') ) {
					alt1=10;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 't':
				{
				alt1=11;
				}
				break;
			case 'r':
				{
				int LA1_7 = input.LA(2);
				if ( (LA1_7=='e') ) {
					int LA1_14 = input.LA(3);
					if ( (LA1_14=='t') ) {
						alt1=12;
					}
					else if ( (LA1_14=='c') ) {
						alt1=14;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:22: 'veux'
					{
					match("veux"); 

					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:31: 'voulais'
					{
					match("voulais"); 

					}
					break;
				case 4 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:43: 'cherch'
					{
					match("cherch"); 

					}
					break;
				case 5 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:54: 'souhait'
					{
					match("souhait"); 

					}
					break;
				case 6 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:66: 'aimerait'
					{
					match("aimerait"); 

					}
					break;
				case 7 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:79: 'd��sire'
					{
					match("désire"); 

					}
					break;
				case 8 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:89: 'voudrais'
					{
					match("voudrais"); 

					}
					break;
				case 9 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:101: 'affich'
					{
					match("affich"); 

					}
					break;
				case 10 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:111: 'donne'
					{
					match("donne"); 

					}
					break;
				case 11 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:120: 'trouver'
					{
					match("trouver"); 

					}
					break;
				case 12 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:131: 'retourner'
					{
					match("retourner"); 

					}
					break;
				case 13 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:144: 'voulons'
					{
					match("voulons"); 

					}
					break;
				case 14 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:3:154: 'recherch'
					{
					match("recherch"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:9: ( 'article' | 'recherche' | 'etud' | '��v��nements' | 'fichier' | 'comment' | 'informations' | 'salon' | 'actualit' )
			int alt2=9;
			switch ( input.LA(1) ) {
			case 'a':
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='r') ) {
					alt2=1;
				}
				else if ( (LA2_1=='c') ) {
					alt2=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'r':
				{
				alt2=2;
				}
				break;
			case 'e':
				{
				alt2=3;
				}
				break;
			case '\u00E9':
				{
				alt2=4;
				}
				break;
			case 'f':
				{
				alt2=5;
				}
				break;
			case 'c':
				{
				alt2=6;
				}
				break;
			case 'i':
				{
				alt2=7;
				}
				break;
			case 's':
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:11: 'article'
					{
					match("article"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:21: 'recherche'
					{
					match("recherche"); 

					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:33: 'etud'
					{
					match("etud"); 

					}
					break;
				case 4 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:40: '��v��nements'
					{
					match("événements"); 

					}
					break;
				case 5 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:54: 'fichier'
					{
					match("fichier"); 

					}
					break;
				case 6 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:66: 'comment'
					{
					match("comment"); 

					}
					break;
				case 7 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:77: 'informations'
					{
					match("informations"); 

					}
					break;
				case 8 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:92: 'salon'
					{
					match("salon"); 

					}
					break;
				case 9 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:6:100: 'actualit'
					{
					match("actualit"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:9:10: ( 'bulletin' )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:9:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:12:10: ( 'rubrique' )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:12:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:15:9: ( 'num��r' )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:15:11: 'num��r'
			{
			match("numér"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "NOMBRE"
	public final void mNOMBRE() throws RecognitionException {
		try {
			int _type = NOMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:18:9: ( 'combien' | 'nombre' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='c') ) {
				alt3=1;
			}
			else if ( (LA3_0=='n') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:18:11: 'combien'
					{
					match("combien"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:18:22: 'nombre'
					{
					match("nombre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOMBRE"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:21:8: ( 'titre' )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:21:10: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "AVANT"
	public final void mAVANT() throws RecognitionException {
		try {
			int _type = AVANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:24:8: ( 'avant' )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:24:9: 'avant'
			{
			match("avant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AVANT"

	// $ANTLR start "APRES"
	public final void mAPRES() throws RecognitionException {
		try {
			int _type = APRES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:27:7: ( 'apr��s' | 'partir' | 'ant��rieurs' )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='a') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='p') ) {
					alt4=1;
				}
				else if ( (LA4_1=='n') ) {
					alt4=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA4_0=='p') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:27:9: 'apr��s'
					{
					match("après"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:27:17: 'partir'
					{
					match("partir"); 

					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:27:26: 'ant��rieurs'
					{
					match("antérieurs"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APRES"

	// $ANTLR start "PUBLIR"
	public final void mPUBLIR() throws RecognitionException {
		try {
			int _type = PUBLIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:30:9: ( 'publi' | 'parus' | 'ann��e' | 'mois' | 'datant' | 'dat��s' | '��crit' | 'par' )
			int alt5=8;
			switch ( input.LA(1) ) {
			case 'p':
				{
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='u') ) {
					alt5=1;
				}
				else if ( (LA5_1=='a') ) {
					int LA5_7 = input.LA(3);
					if ( (LA5_7=='r') ) {
						int LA5_9 = input.LA(4);
						if ( (LA5_9=='u') ) {
							alt5=2;
						}

						else {
							alt5=8;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				alt5=3;
				}
				break;
			case 'm':
				{
				alt5=4;
				}
				break;
			case 'd':
				{
				int LA5_4 = input.LA(2);
				if ( (LA5_4=='a') ) {
					int LA5_8 = input.LA(3);
					if ( (LA5_8=='t') ) {
						int LA5_10 = input.LA(4);
						if ( (LA5_10=='a') ) {
							alt5=5;
						}
						else if ( (LA5_10=='\u00E9') ) {
							alt5=6;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '\u00E9':
				{
				alt5=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:30:10: 'publi'
					{
					match("publi"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:30:18: 'parus'
					{
					match("parus"); 

					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:30:26: 'ann��e'
					{
					match("année"); 

					}
					break;
				case 4 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:30:34: 'mois'
					{
					match("mois"); 

					}
					break;
				case 5 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:30:41: 'datant'
					{
					match("datant"); 

					}
					break;
				case 6 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:30:50: 'dat��s'
					{
					match("datés"); 

					}
					break;
				case 7 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:30:58: '��crit'
					{
					match("écrit"); 

					}
					break;
				case 8 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:30:67: 'par'
					{
					match("par"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIR"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:6: ( 'janvier' | 'f��vrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'ao?t' | 'septembre' | 'octobre' | 'novembre' | 'd��cembre' )
			int alt6=12;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='a') ) {
					alt6=1;
				}
				else if ( (LA6_1=='u') ) {
					int LA6_10 = input.LA(3);
					if ( (LA6_10=='i') ) {
						int LA6_14 = input.LA(4);
						if ( (LA6_14=='n') ) {
							alt6=6;
						}
						else if ( (LA6_14=='l') ) {
							alt6=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt6=2;
				}
				break;
			case 'm':
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3=='a') ) {
					int LA6_11 = input.LA(3);
					if ( (LA6_11=='r') ) {
						alt6=3;
					}
					else if ( (LA6_11=='i') ) {
						alt6=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4=='v') ) {
					alt6=4;
				}
				else if ( (LA6_4=='o') ) {
					alt6=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt6=9;
				}
				break;
			case 'o':
				{
				alt6=10;
				}
				break;
			case 'n':
				{
				alt6=11;
				}
				break;
			case 'd':
				{
				alt6=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:7: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:17: 'f��vrier'
					{
					match("février"); 

					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:27: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:34: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:42: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:48: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:55: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:65: 'ao?t'
					{
					match("août"); 

					}
					break;
				case 9 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:72: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:84: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:94: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:33:105: 'd��cembre'
					{
					match("décembre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIS"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:36:7: ( ( '1' .. '2' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:36:8: ( '1' .. '2' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '2') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:39:6: ( ( '0' .. '3' ) ( '0' .. '9' ) | ( '1' .. '9' ) )
			int alt7=2;
			switch ( input.LA(1) ) {
			case '1':
			case '2':
			case '3':
				{
				int LA7_1 = input.LA(2);
				if ( ((LA7_1 >= '0' && LA7_1 <= '9')) ) {
					alt7=1;
				}

				else {
					alt7=2;
				}

				}
				break;
			case '0':
				{
				alt7=1;
				}
				break;
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				alt7=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:39:7: ( '0' .. '3' ) ( '0' .. '9' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:39:28: ( '1' .. '9' )
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOUR"

	// $ANTLR start "CONTACT"
	public final void mCONTACT() throws RecognitionException {
		try {
			int _type = CONTACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:42:9: ( 'contact' | 'contacts' | 'mail' | 'auteur' | 'qui' )
			int alt8=5;
			switch ( input.LA(1) ) {
			case 'c':
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='o') ) {
					int LA8_5 = input.LA(3);
					if ( (LA8_5=='n') ) {
						int LA8_6 = input.LA(4);
						if ( (LA8_6=='t') ) {
							int LA8_7 = input.LA(5);
							if ( (LA8_7=='a') ) {
								int LA8_8 = input.LA(6);
								if ( (LA8_8=='c') ) {
									int LA8_9 = input.LA(7);
									if ( (LA8_9=='t') ) {
										int LA8_10 = input.LA(8);
										if ( (LA8_10=='s') ) {
											alt8=2;
										}

										else {
											alt8=1;
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 8, 9, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 8, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 8, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				alt8=3;
				}
				break;
			case 'a':
				{
				alt8=4;
				}
				break;
			case 'q':
				{
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:42:11: 'contact'
					{
					match("contact"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:42:23: 'contacts'
					{
					match("contacts"); 

					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:42:35: 'mail'
					{
					match("mail"); 

					}
					break;
				case 4 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:42:42: 'auteur'
					{
					match("auteur"); 

					}
					break;
				case 5 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:42:51: 'qui'
					{
					match("qui"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTACT"

	// $ANTLR start "MAIL"
	public final void mMAIL() throws RecognitionException {
		try {
			int _type = MAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:45:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '.' )+ ( '@' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '.' )+ )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:45:7: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '.' )+ ( '@' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '.' )+
			{
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:45:7: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '.' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '-' && LA9_0 <= '.')||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:
					{
					if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:45:47: ( '@' )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:45:48: '@'
			{
			match('@'); 
			}

			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:45:52: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '.' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '-' && LA10_0 <= '.')||(LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:
					{
					if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIL"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:48:6: ( 'et' | 'ou' | 'sans' | 'pas' )
			int alt11=4;
			switch ( input.LA(1) ) {
			case 'e':
				{
				alt11=1;
				}
				break;
			case 'o':
				{
				alt11=2;
				}
				break;
			case 's':
				{
				alt11=3;
				}
				break;
			case 'p':
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:48:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:48:15: 'ou'
					{
					match("ou"); 

					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:48:21: 'sans'
					{
					match("sans"); 

					}
					break;
				case 4 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:48:28: 'pas'
					{
					match("pas"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ"

	// $ANTLR start "OPERATOR"
	public final void mOPERATOR() throws RecognitionException {
		try {
			int _type = OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:51:10: ( 'inf��rieur' | 'sup��rieur' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='i') ) {
				alt12=1;
			}
			else if ( (LA12_0=='s') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:51:12: 'inf��rieur'
					{
					match("inférieur"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:51:25: 'sup��rieur'
					{
					match("supérieur"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERATOR"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:54:7: ( '.' | '?' )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:
			{
			if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:5: ( 'contenir' | 'portant' | 'proveneant' | 'domaine' | 'th��me' | 'parler' | 'parlent' | 'abordent' | 'traitan' | 'sur' | 'sujet' | 'mentionant' | 'contenant' | 'poss��d' | 'contien' | 'mentionnent' | 'citent' | 'propos' | 'traite' | 'coeur' | 'trait' | 'parle' | 'trouvent' | 'trouve' | 'concern' | '��voquent' )
			int alt13=26;
			switch ( input.LA(1) ) {
			case 'c':
				{
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='o') ) {
					int LA13_9 = input.LA(3);
					if ( (LA13_9=='n') ) {
						int LA13_18 = input.LA(4);
						if ( (LA13_18=='t') ) {
							int LA13_29 = input.LA(5);
							if ( (LA13_29=='e') ) {
								int LA13_37 = input.LA(6);
								if ( (LA13_37=='n') ) {
									int LA13_43 = input.LA(7);
									if ( (LA13_43=='i') ) {
										alt13=1;
									}
									else if ( (LA13_43=='a') ) {
										alt13=13;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 13, 43, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 13, 37, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA13_29=='i') ) {
								alt13=15;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 13, 29, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA13_18=='c') ) {
							alt13=25;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 13, 18, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA13_9=='e') ) {
						alt13=20;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA13_1=='i') ) {
					alt13=17;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'p':
				{
				switch ( input.LA(2) ) {
				case 'o':
					{
					int LA13_11 = input.LA(3);
					if ( (LA13_11=='r') ) {
						alt13=2;
					}
					else if ( (LA13_11=='s') ) {
						alt13=14;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'r':
					{
					int LA13_12 = input.LA(3);
					if ( (LA13_12=='o') ) {
						int LA13_22 = input.LA(4);
						if ( (LA13_22=='v') ) {
							alt13=3;
						}
						else if ( (LA13_22=='p') ) {
							alt13=18;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 13, 22, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'a':
					{
					int LA13_13 = input.LA(3);
					if ( (LA13_13=='r') ) {
						int LA13_23 = input.LA(4);
						if ( (LA13_23=='l') ) {
							int LA13_33 = input.LA(5);
							if ( (LA13_33=='e') ) {
								switch ( input.LA(6) ) {
								case 'r':
									{
									alt13=6;
									}
									break;
								case 'n':
									{
									alt13=7;
									}
									break;
								default:
									alt13=22;
								}
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 13, 33, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 13, 23, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'd':
				{
				alt13=4;
				}
				break;
			case 't':
				{
				int LA13_4 = input.LA(2);
				if ( (LA13_4=='h') ) {
					alt13=5;
				}
				else if ( (LA13_4=='r') ) {
					int LA13_15 = input.LA(3);
					if ( (LA13_15=='a') ) {
						int LA13_24 = input.LA(4);
						if ( (LA13_24=='i') ) {
							int LA13_34 = input.LA(5);
							if ( (LA13_34=='t') ) {
								switch ( input.LA(6) ) {
								case 'a':
									{
									alt13=9;
									}
									break;
								case 'e':
									{
									alt13=19;
									}
									break;
								default:
									alt13=21;
								}
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 13, 34, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 13, 24, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA13_15=='o') ) {
						int LA13_25 = input.LA(4);
						if ( (LA13_25=='u') ) {
							int LA13_35 = input.LA(5);
							if ( (LA13_35=='v') ) {
								int LA13_41 = input.LA(6);
								if ( (LA13_41=='e') ) {
									int LA13_50 = input.LA(7);
									if ( (LA13_50=='n') ) {
										alt13=23;
									}

									else {
										alt13=24;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 13, 41, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 13, 35, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 13, 25, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				alt13=8;
				}
				break;
			case 's':
				{
				int LA13_6 = input.LA(2);
				if ( (LA13_6=='u') ) {
					int LA13_16 = input.LA(3);
					if ( (LA13_16=='r') ) {
						alt13=10;
					}
					else if ( (LA13_16=='j') ) {
						alt13=11;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				int LA13_7 = input.LA(2);
				if ( (LA13_7=='e') ) {
					int LA13_17 = input.LA(3);
					if ( (LA13_17=='n') ) {
						int LA13_28 = input.LA(4);
						if ( (LA13_28=='t') ) {
							int LA13_36 = input.LA(5);
							if ( (LA13_36=='i') ) {
								int LA13_42 = input.LA(6);
								if ( (LA13_42=='o') ) {
									int LA13_51 = input.LA(7);
									if ( (LA13_51=='n') ) {
										int LA13_56 = input.LA(8);
										if ( (LA13_56=='a') ) {
											alt13=12;
										}
										else if ( (LA13_56=='n') ) {
											alt13=16;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 13, 56, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 13, 51, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 13, 42, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 13, 36, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 13, 28, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '\u00E9':
				{
				alt13=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:7: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:19: 'portant'
					{
					match("portant"); 

					}
					break;
				case 3 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:30: 'proveneant'
					{
					match("proveneant"); 

					}
					break;
				case 4 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:45: 'domaine'
					{
					match("domaine"); 

					}
					break;
				case 5 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:56: 'th��me'
					{
					match("thème"); 

					}
					break;
				case 6 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:66: 'parler'
					{
					match("parler"); 

					}
					break;
				case 7 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:77: 'parlent'
					{
					match("parlent"); 

					}
					break;
				case 8 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:89: 'abordent'
					{
					match("abordent"); 

					}
					break;
				case 9 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:101: 'traitan'
					{
					match("traitan"); 

					}
					break;
				case 10 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:113: 'sur'
					{
					match("sur"); 

					}
					break;
				case 11 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:121: 'sujet'
					{
					match("sujet"); 

					}
					break;
				case 12 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:129: 'mentionant'
					{
					match("mentionant"); 

					}
					break;
				case 13 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:144: 'contenant'
					{
					match("contenant"); 

					}
					break;
				case 14 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:158: 'poss��d'
					{
					match("possèd"); 

					}
					break;
				case 15 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:168: 'contien'
					{
					match("contien"); 

					}
					break;
				case 16 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:179: 'mentionnent'
					{
					match("mentionnent"); 

					}
					break;
				case 17 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:194: 'citent'
					{
					match("citent"); 

					}
					break;
				case 18 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:205: 'propos'
					{
					match("propos"); 

					}
					break;
				case 19 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:216: 'traite'
					{
					match("traite"); 

					}
					break;
				case 20 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:226: 'coeur'
					{
					match("coeur"); 

					}
					break;
				case 21 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:235: 'trait'
					{
					match("trait"); 

					}
					break;
				case 22 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:243: 'parle'
					{
					match("parle"); 

					}
					break;
				case 23 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:253: 'trouvent'
					{
					match("trouvent"); 

					}
					break;
				case 24 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:265: 'trouve'
					{
					match("trouve"); 

					}
					break;
				case 25 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:274: 'concern'
					{
					match("concern"); 

					}
					break;
				case 26 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:56:284: '��voquent'
					{
					match("�évoquent"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "FIN"
	public final void mFIN() throws RecognitionException {
		try {
			int _type = FIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:59:5: ( 'appara?t' )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:59:6: 'appara?t'
			{
			match("appara?t"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:5: ( ( ' ' | '\\t' | '\\r' | 'quel' | 'moi' | 'list' | 'tous' | 'ont' | 'mot' | 'mots' | 'terme' | 'quels' | 'atil' | 'quelle' ) | '\\n' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\t'||LA15_0=='\r'||LA15_0==' '||LA15_0=='a'||(LA15_0 >= 'l' && LA15_0 <= 'm')||LA15_0=='o'||LA15_0=='q'||LA15_0=='t') ) {
				alt15=1;
			}
			else if ( (LA15_0=='\n') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:7: ( ' ' | '\\t' | '\\r' | 'quel' | 'moi' | 'list' | 'tous' | 'ont' | 'mot' | 'mots' | 'terme' | 'quels' | 'atil' | 'quelle' )
					{
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:7: ( ' ' | '\\t' | '\\r' | 'quel' | 'moi' | 'list' | 'tous' | 'ont' | 'mot' | 'mots' | 'terme' | 'quels' | 'atil' | 'quelle' )
					int alt14=14;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt14=1;
						}
						break;
					case '\t':
						{
						alt14=2;
						}
						break;
					case '\r':
						{
						alt14=3;
						}
						break;
					case 'q':
						{
						int LA14_4 = input.LA(2);
						if ( (LA14_4=='u') ) {
							int LA14_10 = input.LA(3);
							if ( (LA14_10=='e') ) {
								int LA14_14 = input.LA(4);
								if ( (LA14_14=='l') ) {
									switch ( input.LA(5) ) {
									case 's':
										{
										alt14=12;
										}
										break;
									case 'l':
										{
										alt14=14;
										}
										break;
									default:
										alt14=4;
									}
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 14, 14, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 14, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 14, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'm':
						{
						int LA14_5 = input.LA(2);
						if ( (LA14_5=='o') ) {
							int LA14_11 = input.LA(3);
							if ( (LA14_11=='i') ) {
								alt14=5;
							}
							else if ( (LA14_11=='t') ) {
								int LA14_16 = input.LA(4);
								if ( (LA14_16=='s') ) {
									alt14=10;
								}

								else {
									alt14=9;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 14, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 14, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'l':
						{
						alt14=6;
						}
						break;
					case 't':
						{
						int LA14_7 = input.LA(2);
						if ( (LA14_7=='o') ) {
							alt14=7;
						}
						else if ( (LA14_7=='e') ) {
							alt14=11;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 14, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'o':
						{
						alt14=8;
						}
						break;
					case 'a':
						{
						alt14=13;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:26: 'quel'
							{
							match("quel"); 

							}
							break;
						case 5 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:34: 'moi'
							{
							match("moi"); 

							}
							break;
						case 6 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:42: 'list'
							{
							match("list"); 

							}
							break;
						case 7 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:51: 'tous'
							{
							match("tous"); 

							}
							break;
						case 8 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:59: 'ont'
							{
							match("ont"); 

							}
							break;
						case 9 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:66: 'mot'
							{
							match("mot"); 

							}
							break;
						case 10 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:72: 'mots'
							{
							match("mots"); 

							}
							break;
						case 11 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:80: 'terme'
							{
							match("terme"); 

							}
							break;
						case 12 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:89: 'quels'
							{
							match("quels"); 

							}
							break;
						case 13 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:97: 'atil'
							{
							match("atil"); 

							}
							break;
						case 14 :
							// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:105: 'quelle'
							{
							match("quelle"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:62:127: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:65:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '?' .. '��' | '0' .. '9' | '-' )+ )
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:65:7: ( 'A' .. 'Z' | 'a' .. 'z' | '?' .. '��' | '0' .. '9' | '-' )+
			{
			// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:65:7: ( 'A' .. 'Z' | 'a' .. 'z' | '?' .. '��' | '0' .. '9' | '-' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='-'||(LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= '?' && LA16_0 <= '\u00FC')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '?' && input.LA(1) <= '\u00FC') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | RUBRIQUE | NUMERO | NOMBRE | TITRE | AVANT | APRES | PUBLIR | MOIS | ANNEE | JOUR | CONTACT | MAIL | CONJ | OPERATOR | POINT | MOT | FIN | WS | VAR )
		int alt17=22;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:34: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 5 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:43: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 6 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:50: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 7 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:57: TITRE
				{
				mTITRE(); 

				}
				break;
			case 8 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:63: AVANT
				{
				mAVANT(); 

				}
				break;
			case 9 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:69: APRES
				{
				mAPRES(); 

				}
				break;
			case 10 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:75: PUBLIR
				{
				mPUBLIR(); 

				}
				break;
			case 11 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:82: MOIS
				{
				mMOIS(); 

				}
				break;
			case 12 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:87: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 13 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:93: JOUR
				{
				mJOUR(); 

				}
				break;
			case 14 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:98: CONTACT
				{
				mCONTACT(); 

				}
				break;
			case 15 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:106: MAIL
				{
				mMAIL(); 

				}
				break;
			case 16 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:111: CONJ
				{
				mCONJ(); 

				}
				break;
			case 17 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:116: OPERATOR
				{
				mOPERATOR(); 

				}
				break;
			case 18 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:125: POINT
				{
				mPOINT(); 

				}
				break;
			case 19 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:131: MOT
				{
				mMOT(); 

				}
				break;
			case 20 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:135: FIN
				{
				mFIN(); 

				}
				break;
			case 21 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:139: WS
				{
				mWS(); 

				}
				break;
			case 22 :
				// C:\\Users\\�ƽ�\\Desktop\\GI04\\LO17\\TD4\\tal_sql.g:1:142: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA17_eotS =
		"\1\uffff\21\34\2\123\1\34\1\123\1\34\1\126\1\34\1\126\1\uffff\1\34\1\uffff"+
		"\3\34\1\uffff\34\34\1\u0084\22\34\1\u0084\1\34\1\123\1\uffff\1\123\1\34"+
		"\1\uffff\3\34\1\40\12\34\1\u00b1\36\34\1\uffff\12\34\1\u00df\1\u0084\4"+
		"\34\2\32\1\34\1\u00e9\4\34\1\32\1\34\1\u00f0\4\34\1\u00f6\11\34\1\u0084"+
		"\2\34\1\uffff\13\34\1\u00e9\2\34\1\32\12\34\1\32\4\34\1\u011f\16\34\1"+
		"\uffff\5\34\1\u00df\1\32\1\u00e9\1\u00f0\1\uffff\2\34\1\u00e9\2\34\1\u0137"+
		"\1\uffff\2\32\3\34\1\uffff\7\34\1\u00b1\2\34\1\u011f\2\34\1\u00b1\4\34"+
		"\1\u014d\1\u00e9\1\u014e\2\34\1\u00df\4\34\1\u00f6\2\34\1\u00df\1\34\1"+
		"\u00b1\1\u015a\1\u00b1\1\32\3\34\1\uffff\2\34\1\u00df\5\34\1\u0165\3\34"+
		"\1\u00df\1\u00b1\1\u00df\10\34\1\uffff\1\32\5\34\1\u00f6\6\34\1\u00b1"+
		"\4\34\1\u00f6\2\34\2\uffff\2\34\1\u00f0\1\34\1\u00f6\2\34\1\u00df\1\u00b1"+
		"\1\34\1\u00b1\1\uffff\12\34\1\uffff\1\u0197\1\34\1\u014e\1\u00b1\2\34"+
		"\1\u00b1\1\34\1\u00b1\4\34\1\32\3\u00f6\1\34\1\u011f\1\u0197\1\u00f0\2"+
		"\34\2\u00b1\1\u00f6\3\34\1\u011f\5\34\1\u00b1\1\u00f6\1\34\1\u00b1\5\34"+
		"\1\u011f\1\u00e9\3\34\1\uffff\1\34\2\u00b1\2\34\3\u00e9\1\u00f6\1\u00f0"+
		"\1\u00b1\3\34\1\u00f6\1\u011f\1\u01bc\1\34\1\u00b1\1\u00e9\1\u00b1\1\34"+
		"\1\u00f6\1\u01c0\1\34\1\u00b1\2\34\1\u01c4\1\u00e9\3\34\1\u00b1\1\u00e9"+
		"\1\u01c8\1\uffff\1\34\1\u00f6\1\u011f\1\uffff\2\34\1\u01c8\1\uffff\3\34"+
		"\1\uffff\1\u014e\1\u011f\1\34\2\u00b1\2\34\1\u00b1\1\u011f";
	static final String DFA17_eofS =
		"\u01d2\uffff";
	static final String DFA17_minS =
		"\1\11\10\55\1\143\20\55\1\uffff\1\55\1\uffff\3\55\1\uffff\22\55\1\143"+
		"\12\55\1\157\1\162\1\55\1\166\21\55\1\uffff\2\55\1\uffff\32\55\1\164\3"+
		"\55\1\151\1\145\6\55\1\155\6\55\1\uffff\1\156\1\161\1\151\1\55\1\162\46"+
		"\55\1\162\1\uffff\7\55\1\163\1\55\1\162\1\145\4\55\1\162\1\155\3\55\1"+
		"\163\3\55\1\145\6\55\1\145\1\165\1\164\1\55\1\151\1\55\1\162\1\55\1\162"+
		"\5\55\1\uffff\11\55\1\uffff\6\55\1\uffff\5\55\1\uffff\14\55\1\151\11\55"+
		"\1\151\3\55\1\145\1\142\14\55\1\uffff\1\155\1\145\2\55\1\145\1\55\1\151"+
		"\11\55\1\144\6\55\1\uffff\20\55\1\145\4\55\2\uffff\1\55\1\145\3\55\1\162"+
		"\5\55\1\uffff\3\55\1\145\1\156\1\55\1\162\1\55\1\145\1\55\1\uffff\33\55"+
		"\1\165\3\55\1\164\1\165\1\55\1\145\7\55\1\156\1\164\3\55\1\165\1\55\1"+
		"\uffff\15\55\1\162\3\55\1\162\6\55\1\164\2\55\1\162\10\55\1\uffff\1\163"+
		"\2\55\1\uffff\1\163\2\55\1\uffff\3\55\1\uffff\11\55";
	static final String DFA17_maxS =
		"\1\u00fc\4\172\1\u00e9\3\172\1\166\1\u00e9\7\172\2\u00fc\1\172\1\u00fc"+
		"\3\172\1\u00fc\1\uffff\1\172\1\uffff\3\172\1\uffff\22\172\1\163\4\172"+
		"\1\u00e8\4\172\1\u00fc\1\u00e8\1\162\1\172\1\166\16\172\1\u00fc\1\172"+
		"\1\u00fc\1\uffff\1\u00fc\1\172\1\uffff\3\172\1\u00fc\11\172\1\u00e9\1"+
		"\u00fc\7\172\1\u00e8\1\172\2\u00e9\1\164\3\172\1\151\1\145\2\172\1\u00e9"+
		"\3\172\1\155\6\172\1\uffff\1\156\1\161\1\151\1\172\1\162\1\u00e9\1\172"+
		"\1\u00e9\2\172\2\u00fc\4\172\2\u00fc\1\172\1\u00fc\4\172\1\u00fc\1\172"+
		"\1\u00fc\4\172\1\u00fc\11\172\1\u00fc\1\172\1\162\1\uffff\7\172\1\163"+
		"\1\172\1\162\1\145\1\u00fc\2\172\1\u00fc\1\162\1\155\3\172\1\163\3\172"+
		"\1\145\1\u00fc\4\172\1\u00fc\1\145\1\165\1\164\1\172\1\151\1\172\1\162"+
		"\1\172\1\162\5\172\1\uffff\2\172\1\u00e9\2\172\4\u00fc\1\uffff\2\172\1"+
		"\u00fc\2\172\1\u00fc\1\uffff\2\u00fc\3\172\1\uffff\7\172\1\u00fc\2\172"+
		"\1\u00fc\1\172\1\151\1\u00fc\4\172\3\u00fc\1\172\1\151\1\u00fc\2\172\1"+
		"\145\1\142\1\u00fc\2\172\1\u00fc\1\172\4\u00fc\3\172\1\uffff\1\155\1\145"+
		"\1\u00fc\1\172\1\145\1\172\1\151\1\172\1\u00fc\3\172\3\u00fc\1\172\1\144"+
		"\6\172\1\uffff\1\u00fc\5\172\1\u00fc\6\172\1\u00fc\2\172\1\145\1\172\1"+
		"\u00fc\2\172\2\uffff\1\172\1\145\1\u00fc\1\172\1\u00fc\1\162\1\172\2\u00fc"+
		"\1\172\1\u00fc\1\uffff\3\172\1\145\1\156\1\172\1\162\1\172\1\145\1\172"+
		"\1\uffff\1\u00fc\1\172\2\u00fc\2\172\1\u00fc\1\172\1\u00fc\4\172\4\u00fc"+
		"\1\172\3\u00fc\2\172\3\u00fc\1\172\1\165\1\172\1\u00fc\1\172\1\164\1\165"+
		"\1\172\1\145\2\u00fc\1\172\1\u00fc\3\172\1\156\1\164\2\u00fc\1\172\1\165"+
		"\1\172\1\uffff\1\172\2\u00fc\2\172\6\u00fc\2\172\1\162\3\u00fc\1\162\3"+
		"\u00fc\1\172\2\u00fc\1\164\1\u00fc\1\172\1\162\2\u00fc\3\172\3\u00fc\1"+
		"\uffff\1\163\2\u00fc\1\uffff\1\163\1\172\1\u00fc\1\uffff\3\172\1\uffff"+
		"\2\u00fc\1\172\2\u00fc\2\172\2\u00fc";
	static final String DFA17_acceptS =
		"\32\uffff\1\25\1\uffff\1\26\3\uffff\1\17\62\uffff\1\15\2\uffff\1\22\55"+
		"\uffff\1\20\54\uffff\1\23\55\uffff\1\12\11\uffff\1\13\6\uffff\1\16\5\uffff"+
		"\1\1\50\uffff\1\2\27\uffff\1\14\25\uffff\1\10\1\11\13\uffff\1\7\12\uffff"+
		"\1\5\61\uffff\1\6\44\uffff\1\24\3\uffff\1\4\3\uffff\1\3\3\uffff\1\21\11"+
		"\uffff";
	static final String DFA17_specialS =
		"\u01d2\uffff}>";
	static final String[] DFA17_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\14\uffff\1\33\1\27\1\uffff\1\24\2\22"+
			"\1\23\6\25\5\uffff\1\31\1\34\32\33\6\34\1\4\1\14\1\2\1\5\1\10\1\12\2"+
			"\33\1\13\1\20\1\33\1\30\1\17\1\15\1\21\1\16\1\26\1\7\1\3\1\6\1\33\1\1"+
			"\4\33\156\34\1\11\23\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\36\11\33"+
			"\1\35\13\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\7\33\1\41\1\43\5"+
			"\33\1\42\13\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\45\3\33\1\46\11"+
			"\33\1\44\5\33\1\47\5\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\33\1\61\1\53\2"+
			"\33\1\51\2\33\1\50\4\33\1\56\1\57\1\55\1\33\1\52\1\33\1\62\1\60\1\54"+
			"\4\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\65\15\33\1\64"+
			"\13\33\156\uffff\1\63",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\72\2\33\1"+
			"\70\1\67\5\33\1\71\2\33\1\66\10\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\73\17\33"+
			"\1\74\5\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\75\6\33",
			"\1\77\22\uffff\1\76",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\100\21\33"+
			"\156\uffff\1\101",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\102\14\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\103\5\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\105\5\33"+
			"\1\104\5\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\106\15\33\1\110"+
			"\2\33\1\111\2\33\1\107\5\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\113\3\33\1\114"+
			"\11\33\1\112\13\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\115\23\33\1\116"+
			"\5\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\2\33\1\117\12\33"+
			"\1\121\6\33\1\120\5\33",
			"\1\33\1\40\1\uffff\12\122\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\124\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\124\6\uffff\1\37\32\33\6\uffff\32\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\125\5\33",
			"\2\40\1\uffff\12\40\6\uffff\33\40\6\uffff\32\40",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\127\21\33",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\32\33",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\130\5\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\131\5\33",
			"\1\132\1\40\1\uffff\12\132\7\uffff\32\132\6\uffff\32\132",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\133\25\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\136\7\33"+
			"\1\134\1\135\14\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\137\6\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\140\5\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\141\1\33"+
			"\1\142\14\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\17\33\1\143\12\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\11\33\1\146\5\33"+
			"\1\144\1\33\1\145\10\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\14\33\1\147\15\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\5\33\1\150\24\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\151\6\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\152\6\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\153\20\33\1\154"+
			"\10\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\17\33\1\156\1\33"+
			"\1\155\10\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\160\5\33"+
			"\1\157\6\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\161\1\37\32\33\6\uffff\32\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\162\6\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\163\13\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\164\21\33",
			"\1\166\17\uffff\1\165",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\14\33\1\170\1\167"+
			"\14\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\171\6\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\173\15\33\1\172"+
			"\13\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\174\6\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\32\33\155\uffff"+
			"\1\175",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\176\5\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\177\10\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\2\33\1\u0081\20"+
			"\33\1\u0080\6\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\33\1\u0082\30"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\24\33\1\u0083"+
			"\5\33\u0082\34",
			"\1\u0086\170\uffff\1\u0085",
			"\1\u0087",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\2\33\1\u0088\27"+
			"\33",
			"\1\u0089",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\5\33\1\u008a\24"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u008b\16"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\14\33\1\u008c\15"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\14\33\1\u008d\10"+
			"\33\1\u008e\4\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u008f\1"+
			"\u0090\7\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\33\1\u0091\30"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0092\1"+
			"\u0093\7\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\u0094\13"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0095\12"+
			"\33\1\u0096\6\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0098\10"+
			"\33\1\u0097\10\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u0099\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u009a\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u009b\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u009c\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u009d\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\u009e\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082"+
			"\34",
			"",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u00a0\3\33"+
			"\1\u009f\21\33",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u00a1\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\3\33\1\u00a3\7\33"+
			"\1\u00a2\16\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\27\33\1\u00a4\2"+
			"\33",
			"\1\132\2\uffff\12\132\5\uffff\2\34\32\132\6\34\32\132\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u00a5\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\33\1\u00a7\12"+
			"\33\1\u00a6\15\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\2\33\1\u00a9\20"+
			"\33\1\u00a8\6\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\u00aa\5"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u00ab\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\7\33\1\u00ac\22"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\u00ad\13"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u00ae\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u00af\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\32\33\156\uffff"+
			"\1\u00b0",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u00b2\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u00b3\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u00b4\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u00b5\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\u00b6\5"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u00b7\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u00b8\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\32\33\155\uffff"+
			"\1\u00b9",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u00ba\31\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\32\33\156\uffff"+
			"\1\u00bb",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\32\33\156\uffff"+
			"\1\u00bc",
			"\1\u00bd",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u00be\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u00bf\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u00c0\16"+
			"\33",
			"\1\u00c1",
			"\1\u00c2",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u00c3\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u00c4\31\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u00c5\31\33\156"+
			"\uffff\1\u00c6",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\u00c7\5"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u00c8\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u00c9\10"+
			"\33",
			"\1\u00ca",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u00cb\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\14\33\1\u00cc\15"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\u00cd\13"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\7\33\1\u00ce\22"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u00cf\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\3\33\1\u00d0\26"+
			"\33",
			"",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\7\33\1\u00d4\22"+
			"\33",
			"\1\u00d5",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\u00d6\13"+
			"\33\156\uffff\1\u00d7",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u00d8\16"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\32\33\156\uffff"+
			"\1\u00d9",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\33\1\u00da\30"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u00db\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\13\33\1\u00de"+
			"\7\33\1\u00dc\1\u00dd\5\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u00e0\16"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u00e1\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u00e2\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\17\33\1\u00e4\5"+
			"\33\1\u00e3\4\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\22\33\1\u00e5"+
			"\7\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\22\33\1\u00e6"+
			"\7\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u00e7\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\13\33\1\u00e8"+
			"\16\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u00ea\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\25\33\1\u00eb\4"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u00ed\1"+
			"\33\1\u00ec\14\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\u00ee\13"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\u00ef\6\uffff\1\37\32\33\6\uffff\32\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u00f1\16"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u00f2\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u00f4\15\33\1"+
			"\u00f3\13\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u00f5\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\2\33\1\u00f7\27"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u00f8\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u00f9\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u00fa\3\33\1\u00fb"+
			"\3\33\1\u00fc\21\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u00fd\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u00fe\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u00ff\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u0100\31\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u0101\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0102\25"+
			"\33",
			"\1\u0103",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u0104\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0105\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\2\33\1\u0106\27"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\2\33\1\u0107\27"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u0108\31\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u0109\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u010a\16"+
			"\33",
			"\1\u010b",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u010c\10"+
			"\33",
			"\1\u010d",
			"\1\u010e",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\u010f\5"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\3\33\1\u0110\26"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\u0111",
			"\1\u0112",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0113\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0114\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u0115\14"+
			"\33",
			"\1\u0116",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\25\33\1\u0117\4"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u0118\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0119\25"+
			"\33",
			"\1\u011a",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u011b\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\u011c\5"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u011d\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u011e\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0123\21"+
			"\33",
			"\1\u0124",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0125\10"+
			"\33",
			"\1\u0126",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0127\25"+
			"\33",
			"\1\u0128",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0129\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\14\33\1\u012a\15"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u012b\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u012c\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u012d\25"+
			"\33",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u012e\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u012f\31\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\32\33\156\uffff"+
			"\1\u0130",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0131\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\u0132\13"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0133\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0134\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u0135\16"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\33\1\u0136\30"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\13\33\1\u0139"+
			"\6\33\1\u0138\7\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u013a\4"+
			"\33\1\u013b\14\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u013c\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u013d\31\33",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\7\33\1\u013e\22"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u013f\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0140\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\2\33\1\u0141\27"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u0142\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0143\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0144\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u0145\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0146\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\14\33\1\u0147\15"+
			"\33",
			"\1\u0148",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u0149\31\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\7\33\1\u014a\22"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u014b\16"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\13\33\1\u014c\16"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u014f\31\33",
			"\1\u0150",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0151\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0152\25"+
			"\33",
			"\1\u0153",
			"\1\u0154",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u0155\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u0156\6"+
			"\33",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0157\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\1\u0158\3\33\1"+
			"\u0159\25\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u015b\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u015c\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\20\33\1\u015d\11"+
			"\33",
			"",
			"\1\u015e",
			"\1\u015f",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0160\25"+
			"\33",
			"\1\u0161",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\14\33\1\u0162\15"+
			"\33",
			"\1\u0163",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u0164\6"+
			"\33",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0166\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\33\1\u0167\30"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0168\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\15\33\1\u016a"+
			"\3\33\1\u0169\10\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u016b\14"+
			"\33",
			"\1\u016c",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u016d\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u016e\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\u016f\13"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0170\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0171\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0172\10"+
			"\33",
			"",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0173\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0174\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u0175\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u0176\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0177\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u0178\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u0179\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u017a\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u017c\7\33\1\u017b"+
			"\21\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u017d\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u017e\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u017f\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\33\1\u0180\30"+
			"\33",
			"\1\u0181",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0182\21"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0183\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0184\21"+
			"\33",
			"",
			"",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\u0185\1\37\32\33\6\uffff\32\33",
			"\1\u0186",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u0187\14"+
			"\33",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\u0188",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u0189\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\15\33\1\u018b"+
			"\3\33\1\u018a\10\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u018c\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u018d\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\2\33\1\u018e\27"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\24\33\1\u018f\5"+
			"\33",
			"\1\u0190",
			"\1\u0191",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0192\10"+
			"\33",
			"\1\u0193",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u0194\31\33",
			"\1\u0195",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u0196\21"+
			"\33",
			"",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u0198\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u0199\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u019a\6"+
			"\33",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u019b\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u019c\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u019d\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u019e\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u019f\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u01a0\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\22\33\1\u01a1"+
			"\7\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u01a2\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u01a3\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u01a4\10"+
			"\33",
			"\1\u01a5",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u01a6\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u01a7\6"+
			"\33",
			"\1\u01a8",
			"\1\u01a9",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u01aa\6"+
			"\33",
			"\1\u01ab",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u01ac\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u01ad\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\7\33\1\u01ae\22"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u01af\25"+
			"\33",
			"\1\u01b0",
			"\1\u01b1",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u01b2\6"+
			"\33",
			"\1\u01b3",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u01b4\14"+
			"\33",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u01b5\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u01b6\31\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\1\u01b7\14\33\1"+
			"\u01b8\14\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u01b9\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u01ba\25"+
			"\33",
			"\1\u01bb",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\u01bd",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\21\33\1\u01be\10"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\4\33\1\u01bf\25"+
			"\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\u01c1",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\10\33\1\u01c2\21"+
			"\33",
			"\1\u01c3",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u01c5\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u01c6\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\4\33\1\u01c7\25"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"",
			"\1\u01c9",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"",
			"\1\u01ca",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\16\33\1\u01cb\13"+
			"\33",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u01cc\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u01cd\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u01ce\14"+
			"\33",
			"",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\34\2\uffff\12\34\5\uffff\u00be\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\15\33\1\u01cf\14"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\23\33\1\u01d0\6"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\6\uffff\1\37\32\33\6\uffff\22\33\1\u01d1\7"+
			"\33",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34",
			"\1\33\1\40\1\uffff\12\33\5\uffff\1\34\1\37\32\33\6\34\32\33\u0082\34"
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | BULLETIN | RUBRIQUE | NUMERO | NOMBRE | TITRE | AVANT | APRES | PUBLIR | MOIS | ANNEE | JOUR | CONTACT | MAIL | CONJ | OPERATOR | POINT | MOT | FIN | WS | VAR );";
		}
	}

}
