package api.io.reader;

/* IO, Stream
 * Input + Output
 * 프로그램에 속한 데이터를 외부에 보내거나 외부 데이터 가지고 오는 동작
 * Stream은 F.I.F.O 구조  , 단방향  구조로 한쪽으로 흘러가는 구조
 * Scanner 가 대표적인 InputStream 
 * 실제로 입출력에 대한 제어는 웹에서 이뤄짐..
 * 
 * Input Stream, Output Stream 두가지로 구성 ,
 * 
 * 
 * 보조스트림  : 실제 데이터를 입출력하는 기능은 없지만 스트림의 기능을 향상시키거나 새로운 기능을 추가시킴
 * 프로그램 출력 데이터  => (출력스트림 ) => 모티너, 디스크, 네트웍(Destination) 
 * => ( 입력스트림) => 프로그램
 * Byte기반 , 입출력 단위 : 1byte
 * InputStream, OutputStream 기본 입출력 스트림 , 한글처리 불가능
 * BufferedInputStream , BufferedOutputStream : 버퍼기능 확대
 * FileInputStream ,FileOutputStream : 파일 저장 및 수집기능 확대
 * DataInputStream ,DataOutputStream  : 데이터타입 지정 입출력
 * 
 * 문자기반 스트림  : char는   2 byte  , 문자데이터 입출력시에 어려움이 발생함, 문자 데이터 전용 스트림 
 * Reader, Writer
 * 
 */


public class IOStreamSyntax {
	
	
	
}
