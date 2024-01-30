    import java.awt.AWTException;
	import java.awt.FontFormatException;
	import java.awt.datatransfer.MimeTypeParseException;
	import java.awt.datatransfer.UnsupportedFlavorException;
	import java.awt.geom.NoninvertibleTransformException;
	import java.awt.print.PrinterException;
	import java.beans.IntrospectionException;
	import java.beans.PropertyVetoException;
	import java.io.IOException;
	import java.lang.instrument.IllegalClassFormatException;
	import java.lang.instrument.UnmodifiableClassException;
	import java.lang.invoke.LambdaConversionException;
	import java.net.URISyntaxException;
	import java.nio.channels.AlreadyBoundException;
	import java.rmi.MarshalException;
	import java.rmi.NotBoundException;
	import java.rmi.server.ServerNotActiveException;
	import java.security.GeneralSecurityException;
	import java.security.PrivilegedActionException;
	import java.security.cert.CertificateException;
	import java.sql.SQLException;
	import java.text.ParseException;
	import java.util.TooManyListenersException;
	import java.util.concurrent.BrokenBarrierException;
	import java.util.concurrent.ExecutionException;
	import java.util.concurrent.TimeoutException;
	import java.util.prefs.InvalidPreferencesFormatException;
	import java.util.zip.DataFormatException;

	import javax.management.BadAttributeValueExpException;
	import javax.management.BadBinaryOpValueExpException;
	import javax.management.BadStringOperationException;
	import javax.management.InvalidApplicationException;
	import javax.management.JMException;
	import javax.management.modelmbean.InvalidTargetObjectTypeException;
	import javax.management.modelmbean.XMLParseException;
	import javax.naming.NamingException;
	import javax.print.PrintException;
	import javax.script.ScriptException;
	import javax.security.auth.DestroyFailedException;
	import javax.security.auth.RefreshFailedException;
	import javax.security.auth.callback.UnsupportedCallbackException;
	import javax.security.auth.login.AccountException;
	import javax.sound.midi.InvalidMidiDataException;
	import javax.sound.midi.MidiUnavailableException;
	import javax.sound.sampled.LineUnavailableException;
	import javax.sound.sampled.UnsupportedAudioFileException;
	import javax.swing.UnsupportedLookAndFeelException;
	import javax.swing.text.BadLocationException;
	import javax.swing.tree.ExpandVetoException;
	import javax.transaction.xa.XAException;
	import javax.xml.crypto.KeySelectorException;
	import javax.xml.crypto.URIReferenceException;
	import javax.xml.crypto.dsig.TransformException;
	import javax.xml.crypto.dsig.XMLSignatureException;
	import javax.xml.datatype.DatatypeConfigurationException;
	import javax.xml.parsers.ParserConfigurationException;
	import javax.xml.stream.XMLStreamException;
	import javax.xml.transform.TransformerException;
	import javax.xml.xpath.XPathException;

	import org.ietf.jgss.GSSException;
	import org.xml.sax.SAXException;

	
	public class StringBound {
		void Exceptions1(){
			try {
				String phoneNumber="098787666l";
				long c=Long.parseLong(phoneNumber);
				System.out.println("Phone number");
			//	throw new NumberFormatException();
			}
			catch(NumberFormatException exception) {
				System.out.println("Exception running");
			}
	   }
		
//		public void Exception2() {
//			 try {
//				throw new ActivationException(); 
//			 }catch(ActivationException exception) {
//				System.out.println("Exception2 running"); 
//			 }
//		 }
		 
		 void Exception3() {
			 try {
				 throw new AlreadyBoundException();
			 } catch(AlreadyBoundException exception) {
				System.out.println("Exception3 running"); 
			 }
		 }
		 
		 void Exception4() {
			 try {
				 throw new AccountException();
			 } catch(AccountException exception) {
				System.out.println("Exception4 running"); 
			 }
		 }
		 
		 void Exception5() {
			 try {
				 throw new AWTException("");
			 }catch(AWTException exception) {
				 System.out.println("Exception5 running");
			 }
		 }
		
		 void Exception6() {
			 try {
				 throw new AWTException("");
			 }catch(AWTException exception) {
				 System.out.println("Exception6 running");
			 }
		 }
		
		 void Exception7() {
			 try {
				 throw new BadAttributeValueExpException("");
			 }catch(BadAttributeValueExpException exception) {
				 System.out.println("Exception7 running");
			 }
		 }

		 void Exception8() {
			 try {
				 throw new BadBinaryOpValueExpException(null);
			 }catch(BadBinaryOpValueExpException exception) {
				 System.out.println("Exception8 running");
			 }
		 }
		
		 void Exception9() {
			 try {
				 throw new BadLocationException(null, 0);
			 }catch(BadLocationException exception) {
				 System.out.println("Exception 9 running");
			 }
		 }

		 void Exception10() {
			 try {
				 throw new BadStringOperationException(null);
			 }catch(BadStringOperationException exception) {
				 System.out.println("Exception 10  running");
			 }
		 }
		 
		 void Exception11() {
			 try {
				 throw new BrokenBarrierException();
			 }catch(BrokenBarrierException exception) {
				 System.out.println("Exception 11 running");
			 }
		 }
		 
		 void Exception12() {
			 try {
				 throw new CertificateException();
			 }catch(CertificateException exception) {
				 System.out.println("Exception 12 running");
			 }
		 }
		 
		 void Exception13() {
			 try {
				 throw new CloneNotSupportedException();
			 }catch(CloneNotSupportedException exception) {
				 System.out.println("Exception 13 ordered");
			 }
		 }
		 void Exception14() {
			 try {
				 throw new DataFormatException();
			 }catch(DataFormatException exception) {
				 System.out.println("Exception 14 running");
			 }
		 }
		 void Exception15() {
			 try {
				 throw new DatatypeConfigurationException();
			 }catch(DatatypeConfigurationException exception) {
				 System.out.println("Exception 15 running");
			 }
		 }
		 void Exception16() {
			 try {
				 throw new DestroyFailedException();
			 }catch(DestroyFailedException exception) {
				 System.out.println("Exception 16 running");
			 }
		 }
//		 void Exception17() {
//			 try {
//				 throw new ExecutionException();
//			 }catch(ExecutionException exception) {
//				 System.out.println("Exception 17 ordered");
//			 }
//		 }
		 void Exception18() {
			 try {
				 throw new ExpandVetoException(null, null);
			 }catch(ExpandVetoException exception) {
				 System.out.println("Exception 18 running");
			 }
		 }
		 void Exception19() {
			 try {
				 throw new FontFormatException(null);
			 }catch(FontFormatException exception) {
				 System.out.println("Exception 19 running");
			 }
		 }
		 void Exception20() {
			 try {
				 throw new GeneralSecurityException();
			 }catch(GeneralSecurityException exception) {
				 System.out.println("Exception 20 ordered");
			 }
		 }
		 void Exception21() {
			 try {
				 throw new GSSException(0);
			 }catch(GSSException exception) {
				 System.out.println("Exception 21 running");
			 }
		 }
		 void Exception22() {
			 try {
				 throw new IllegalClassFormatException();
			 }catch(IllegalClassFormatException exception) {
				 System.out.println("Exception 22 running");
			 }
		 }
		 void Exception23() {
			 try {
				 throw new InterruptedException();
			 }catch(InterruptedException exception) {
				 System.out.println("Exception 23 running");
			 }
		 }
		 void Exception24() {
			 try {
				 throw new IntrospectionException(null);
			 }catch(IntrospectionException exception) {
				 System.out.println("Exception 24 running");
			 }
		 }
		 void Exception25() {
			 try {
				 throw new InvalidApplicationException(null);
			 }catch(InvalidApplicationException exception) {
				 System.out.println("Exception 25 running");
			 }
		 }
		 void Exception26() {
			 try {
				 throw new InvalidMidiDataException();
			 }catch(InvalidMidiDataException exception) {
				 System.out.println("Exception 26 running");
			 }
		 }
		 void Exception27() {
			 try {
				 throw new InvalidPreferencesFormatException(null, null);
			 }catch(InvalidPreferencesFormatException exception) {
				 System.out.println("Exception 27 running");
			 }
		 }
		 void Exception28() {
			 try {
				 throw new InvalidTargetObjectTypeException(null);
			 }catch(InvalidTargetObjectTypeException exception) {
				 System.out.println("Exception 28 running");
			 }
		 }
		 void Exception29() {
			 try {
				 throw new IOException();
			 }catch(IOException exception) {
				 System.out.println("Exception 29 running");
			 }
		 }
		 void Exception30() {
			 try {
				 throw new JMException();
			 }catch(JMException exception) {
				 System.out.println("Exception 30 running");
			 }
		 }
		 void Exception31() {
			 try {
				 throw new KeySelectorException();
			 }catch(KeySelectorException exception) {
				 System.out.println("Exception 31 running");
			 }
		 }
		 void Exception32() {
			 try {
				 throw new KeySelectorException();
			 }catch(KeySelectorException exception) {
				 System.out.println("Exception 32 running");
			 }
		 }
		 void Exception33() {
			 try {
				 throw new LambdaConversionException();
			 }catch(LambdaConversionException exception) {
				 System.out.println("Exception running");
			 }
		 }
		 void Exception34() {
			 try {
				 throw new LineUnavailableException();
			 }catch(LineUnavailableException exception) {
				 System.out.println("Exception 34 running");
			 }
		 }
		 void Exception36() {
			 try {
				 throw new MarshalException(null);
			 }catch(MarshalException exception) {
				 System.out.println("Exception 36 running");
			 }
		 }
		 void Exception37() {
			 try {
				 throw new MidiUnavailableException();
			 }catch(MidiUnavailableException exception) {
				 System.out.println("Exception 37 running");
			 }
		 }
		 void Exception38() {
			 try {
				 throw new MimeTypeParseException();
			 }catch(MimeTypeParseException exception) {
				 System.out.println("Exception 38 running");
			 }
		 }
		 void Exception39() {
			 try {
				 throw new NamingException();
			 }catch(NamingException exception) {
				 System.out.println("Exception 39 running");
			 }
		 }
		 void Exception40() {
			 try {
				 throw new NoninvertibleTransformException(null);
			 }catch(NoninvertibleTransformException exception) {
				 System.out.println("Exception 40 running");
			 }
		 }
		 void Exception41() {
			 try {
				 throw new NotBoundException();
			 }catch(NotBoundException exception) {
				 System.out.println("Exception 41 running");
			 }
		 }
		 void Exception42() {
			 try {
				 throw new ParseException(null, 0);
			 }catch(ParseException exception) {
				 System.out.println("Exception 42 running");
			 }
		 }
		 void Exception43() {
			 try {
				 throw new ParserConfigurationException();
			 }catch(ParserConfigurationException exception) {
				 System.out.println("Exception 43 running");
			 }
		 }
		 void Exception44() {
			 try {
				 throw new PrinterException();
			 }catch(PrinterException exception) {
				 System.out.println("Exception 44 running");
			 }
		 }
		 void Exception45() {
			 try {
				 throw new PrintException();
			 }catch(PrintException exception) {
				 System.out.println("Exception 45 running");
			 }
		 }
		 void Exception46() {
			 try {
				 throw new PrivilegedActionException(null);
			 }catch(PrivilegedActionException exception) {
				 System.out.println("Exception 46 running");
			 }
		 }
		 void Exception47() {
			 try {
				 throw new PropertyVetoException(null, null);
			 }catch(PropertyVetoException exception) {
				 System.out.println("Exception 47 running");
			 }
		 }
		 void Exception48() {
			 try {
				 throw new NotBoundException();
			 }catch(NotBoundException exception) {
				 System.out.println("Exception 48 running");
			 }
		 }
		 void Exception49() {
			 try {
				 throw new NotBoundException();
			 }catch(NotBoundException exception) {
				 System.out.println("Exception 49 running");
			 }
		 }
		 void Exception50() {
			 try {
				 throw new ReflectiveOperationException();
			 }catch(ReflectiveOperationException exception) {
				 System.out.println("Exception 50 running");
			 }
		 }
		 void Exception51() {
			 try {
				 throw new RefreshFailedException();
			 }catch(RefreshFailedException exception) {
				 System.out.println("Exception 51 running");
			 }
		 }
		 void Exception52() {
			 try {
				 throw new NotBoundException();
			 }catch(NotBoundException exception) {
				 System.out.println("Exception 52 running");
			 }
		 }
		 void Exception53() {
			 try {
				 throw new RuntimeException();
			 }catch(RuntimeException exception) {
				 System.out.println("Exception 53 running");
			 }
		 }
		 void Exception54() {
			 try {
				 throw new NotBoundException();
			 }catch(NotBoundException exception) {
				 System.out.println("Exception 54 running");
			 }
		 }
		 void Exception55() {
			 try {
				 throw new SAXException();
			 }catch(SAXException exception) {
				 System.out.println("Exception 55 running");
			 }
		 }
		 void Exception56() {
			 try {
				 throw new ScriptException(null, null, 0);
			 }catch(ScriptException exception) {
				 System.out.println("Exception 56 running");
			 }
		 }
		 void Exception57() {
			 try {
				 throw new ServerNotActiveException(null);
			 }catch(ServerNotActiveException exception) {
				 System.out.println("Exception 57 running");
			 }
		 }
		 void Exception58() {
			 try {
				 throw new SQLException(null, null, 0);
			 }catch(SQLException exception) {
				 System.out.println("Exception 58 running");
			 }
		 }
		 void Exception59() {
			 try {
				 throw new TimeoutException();
			 }catch(TimeoutException exception) {
				 System.out.println("Exception 59 running");
			 }
		 }
		 void Exception60() {
			 try {
				 throw new TooManyListenersException();
			 }catch(TooManyListenersException exception) {
				 System.out.println("Exception 60 running");
			 }
		 }
		 void Exception61() {
			 try {
				 throw new TransformerException("");
			 }catch(TransformerException exception) {
				 System.out.println("Exception 61 running");
			 }
		 }
		 void Exception62() {
			 try {
				 throw new TransformException();
			 }catch(TransformException exception) {
				 System.out.println("Exception 62 running");
			 }
		 }
		 void Exception63() {
			 try {
				 throw new UnmodifiableClassException();
			 }catch(UnmodifiableClassException exception) {
				 System.out.println("Exception 63 ordered");
			 }
		 }
		 void Exception64() {
			 try {
				 throw new UnsupportedAudioFileException();
			 }catch(UnsupportedAudioFileException exception) {
				 System.out.println("Exception 64 running");
			 }
		 }
		 void Exception65() {
			 try {
				 throw new UnsupportedCallbackException(null, null);
			 }catch(UnsupportedCallbackException exception) {
				 System.out.println("Exception 65 running");
			 }
		 }
		 void Exception66() {
			 try {
				 throw new UnsupportedFlavorException(null);
			 }catch(UnsupportedFlavorException exception) {
				 System.out.println("Exception 66 running");
			 }
		 }
		 void Exception67() {
			 try {
				 throw new UnsupportedLookAndFeelException(null);
			 }catch(UnsupportedLookAndFeelException exception) {
				 System.out.println("Exception 67 running");
			 }
		 }
		 void Exception68() {
			 try {
				 throw new URIReferenceException();
			 }catch(URIReferenceException exception) {
				 System.out.println("Exception 68 running");
			 }
		 }
		 void Exception69() {
			 try {
				 throw new URISyntaxException(null, null, 0);
			 }catch(URISyntaxException exception) {
				 System.out.println("Exception 69 running");
			 }
		 }
		 void Exception70() {
			 try {
				 throw new XMLParseException(null, null);
			 }catch(XMLParseException exception) {
				 System.out.println("Exception 70 running");
			 }
		 }
		 void Exception71() {
			 try {
				 throw new XMLSignatureException();
			 }catch(XMLSignatureException exception) {
				 System.out.println("Exception 71 running");
			 }
		 }
		 void Exception72() {
			 try {
				 throw new XMLStreamException();
			 }catch(XMLStreamException exception) {
				 System.out.println("Exception 72 running");
			 }
		 }
 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
		    
		


