/*
 * %Z%%W% %I%
 *
 * =========================================================================
 * Licensed Materials - Property of IBM
 * "Restricted Materials of IBM"
 * Copyright IBM Corp. 2007. All Rights Reserved
 * 
 * DISCLAIMER: 
 * The following [enclosed] code is sample code created by IBM 
 * Corporation.  This sample code is not part of any standard IBM product 
 * and is provided to you solely for the purpose of assisting you in the 
 * development of your applications.  The code is provided 'AS IS', 
 * without warranty of any kind.  IBM shall not be liable for any damages 
 * arising out of your use of the sample code, even if they have been 
 * advised of the possibility of such damages.
 * =========================================================================
 */
package com.ibm.jzos.sample.fields;
import com.ibm.jzos.fields.AssemblerDatatypeFactory;
import com.ibm.jzos.fields.StringField;

// Generated by com.ibm.jzos.recordgen.asm.RecordClassGenerator on: Tue Jul 17 11:58:50 EDT 2007

/** 
 * Maps a Product/Subsystem section of SMF record 83 (RACF Security information).
 * This code (excluding these notes) was generated using 
 * <code>com.ibm.jzos.recordgen.asm.RecordClassGenerator</code> using the following JCL:
 * 
 * <pre><code>
//ASSEMBLE EXEC ASMAC,PARM='ADATA,LIST,NOTERM,NODECK,NOOBJECT' 
//C.SYSIN DD * 
      IFASMFR 83 
      END 
//C.SYSADATA DD DSN=&&ADATA,DISP=(NEW,PASS), 
//           SPACE=(CYL,(3,1)) 
//* 
//JAVA EXEC PROC=EXJZOSVM,VERSION='50' 
//MAINARGS DD * 
com.ibm.jzos.recordgen.asm.RecordClassGenerator 
  section=SMF83PSS 
  bufoffset=true 
  package=com.ibm.jzos.sample.fields 
  class=Smf83Product
//SYSADATA DD DSN=&&ADATA,DISP=(OLD,DELETE) 
//STDOUT DD PATH='/home/user/Smf83Product.java', 
//          PATHOPTS=(OWRONLY,OCREAT), 
//          PATHMODE=SIRWXU 
//STDENV DD * 
...
   </code></pre>
 * @see Smf83Record Smf83Record for a class that glues together the components of a SMF 83 record
 * @since 2.1.0
 */

public class Smf83Product {

	protected static AssemblerDatatypeFactory factory = new AssemblerDatatypeFactory();

	/** *                                                                  @D6A <br/>
	    *        PRODUCT OR SUBSYSTEM SECTION                              @D6A <br/>
	    *                                                                  @D6A <br/>
	    SMF83PSS DSECT ,        PRODUCT OR SUBSYSTEM SECTION               @D6A  */
	public static int SMF83PSS = factory.getOffset();

	/** SMF83DF2 DS    CL8      FIELDS IN FIXED RECORDS SECTION THAT ARE   @D6A  */
	protected static StringField SMF83DF2 = factory.getStringField(8, true);

	/** *                       NOT IN SMF TYPE 80 RECORD                  @D6A <br/>
	             ORG   SMF83DF2                                            @D6C  <br/>
	    SMF83RVN DS    CL4      VERSION RELEASE MODIFICATION NUMBER        @D6A  */
	static { factory.incrementOffset(-8); }
	protected static StringField SMF83RVN = factory.getStringField(4, true);

	/** SMF83PNM DS    CL4      PRODUCT NAME - RACF                        @D6A  */
	protected static StringField SMF83PNM = factory.getStringField(4, true);

	protected byte[] bytes;
	protected int bufOffset;

	// Instance variables used to cache field values 
	private String smf83df2;
	private String smf83rvn;
	private String smf83pnm;


	public Smf83Product(byte[] buffer, int bufOffset) {
		this.bytes = buffer;
		this.bufOffset = bufOffset;
	}


	public String getSmf83df2() {
		if (smf83df2 == null) {
			smf83df2 = SMF83DF2.getString(bytes, bufOffset);
		}
		return smf83df2;
	}

	public void setSmf83df2(String smf83df2) {
		if (SMF83DF2.equals(this.smf83df2, smf83df2))
			return;
		SMF83DF2.putString(smf83df2, bytes, bufOffset);
		this.smf83df2 = smf83df2;
	}

	public String getSmf83rvn() {
		if (smf83rvn == null) {
			smf83rvn = SMF83RVN.getString(bytes, bufOffset);
		}
		return smf83rvn;
	}

	public void setSmf83rvn(String smf83rvn) {
		if (SMF83RVN.equals(this.smf83rvn, smf83rvn))
			return;
		SMF83RVN.putString(smf83rvn, bytes, bufOffset);
		this.smf83rvn = smf83rvn;
	}

	public String getSmf83pnm() {
		if (smf83pnm == null) {
			smf83pnm = SMF83PNM.getString(bytes, bufOffset);
		}
		return smf83pnm;
	}

	public void setSmf83pnm(String smf83pnm) {
		if (SMF83PNM.equals(this.smf83pnm, smf83pnm))
			return;
		SMF83PNM.putString(smf83pnm, bytes, bufOffset);
		this.smf83pnm = smf83pnm;
	}

}
