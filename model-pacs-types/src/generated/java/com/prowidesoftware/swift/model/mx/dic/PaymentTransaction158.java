
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides further details on the original transactions, to which the status report message refers.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
@XmlType(name = "PaymentTransaction158", propOrder = {
    "stsReqId",
    "orgnlGrpInf",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlTxId",
    "orgnlUETR",
    "accptncDtTm",
    "clrSysRef",
    "instgAgt",
    "instdAgt",
    "orgnlTxRef",
    "splmtryData"
})
public class PaymentTransaction158 {

    @XmlElement(name = "StsReqId")
    protected String stsReqId;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation29 orgnlGrpInf;
=======
@XmlType(name = "PaymentTransaction160", propOrder = {
    "stsId",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlUETR",
    "txSts",
    "stsRsnInf",
    "chrgsInf",
    "trckrData",
    "accptncDtTm",
    "acctSvcrRef",
    "clrSysRef",
    "orgnlTxRef",
    "splmtryData"
})
public class PaymentTransaction160 {

    @XmlElement(name = "StsId")
    protected String stsId;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    @XmlElement(name = "OrgnlTxId")
    protected String orgnlTxId;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "AccptncDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime accptncDtTm;
    @XmlElement(name = "ClrSysRef")
    protected String clrSysRef;
    @XmlElement(name = "InstgAgt")
    protected BranchAndFinancialInstitutionIdentification8 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification8 instdAgt;
=======
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "TxSts")
    protected String txSts;
    @XmlElement(name = "StsRsnInf")
    protected List<StatusReasonInformation14> stsRsnInf;
    @XmlElement(name = "ChrgsInf")
    protected List<Charges16> chrgsInf;
    @XmlElement(name = "TrckrData")
    protected TrackerData7 trckrData;
    @XmlElement(name = "AccptncDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accptncDtTm;
    @XmlElement(name = "AcctSvcrRef")
    protected String acctSvcrRef;
    @XmlElement(name = "ClrSysRef")
    protected String clrSysRef;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
    @XmlElement(name = "OrgnlTxRef")
    protected OriginalTransactionReference42 orgnlTxRef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsReqId() {
        return stsReqId;
    }

    /**
     * Sets the value of the stsReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public PaymentTransaction158 setStsReqId(String value) {
        this.stsReqId = value;
=======
    public PaymentTransaction160 setStsId(String value) {
        this.stsId = value;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        return this;
    }

    /**
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public PaymentTransaction158 setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
        return this;
    }

    /**
=======
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public PaymentTransaction158 setOrgnlInstrId(String value) {
=======
    public PaymentTransaction160 setOrgnlInstrId(String value) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        this.orgnlInstrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public PaymentTransaction158 setOrgnlEndToEndId(String value) {
=======
    public PaymentTransaction160 setOrgnlEndToEndId(String value) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        this.orgnlEndToEndId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public PaymentTransaction158 setOrgnlTxId(String value) {
        this.orgnlTxId = value;
=======
    public PaymentTransaction160 setOrgnlUETR(String value) {
        this.orgnlUETR = value;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        return this;
    }

    /**
     * Gets the value of the orgnlUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public String getOrgnlUETR() {
        return orgnlUETR;
=======
    public String getTxSts() {
        return txSts;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public PaymentTransaction158 setOrgnlUETR(String value) {
        this.orgnlUETR = value;
=======
    public PaymentTransaction160 setTxSts(String value) {
        this.txSts = value;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        return this;
    }

    /**
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
     * Gets the value of the accptncDtTm property.
=======
     * Gets the value of the stsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation14 }
     * 
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public OffsetDateTime getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * Sets the value of the accptncDtTm property.
=======
    public List<StatusReasonInformation14> getStsRsnInf() {
        if (stsRsnInf == null) {
            stsRsnInf = new ArrayList<StatusReasonInformation14>();
        }
        return this.stsRsnInf;
    }

    /**
     * Gets the value of the chrgsInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgsInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgsInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges16 }
     * 
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public PaymentTransaction158 setAccptncDtTm(OffsetDateTime value) {
        this.accptncDtTm = value;
        return this;
    }

    /**
     * Gets the value of the clrSysRef property.
=======
    public List<Charges16> getChrgsInf() {
        if (chrgsInf == null) {
            chrgsInf = new ArrayList<Charges16>();
        }
        return this.chrgsInf;
    }

    /**
     * Gets the value of the trckrData property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerData7 }
     *     
     */
    public TrackerData7 getTrckrData() {
        return trckrData;
    }

    /**
     * Sets the value of the trckrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerData7 }
     *     
     */
    public PaymentTransaction160 setTrckrData(TrackerData7 value) {
        this.trckrData = value;
        return this;
    }

    /**
     * Gets the value of the accptncDtTm property.
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrSysRef() {
        return clrSysRef;
    }

    /**
     * Sets the value of the clrSysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public PaymentTransaction158 setClrSysRef(String value) {
        this.clrSysRef = value;
=======
    public PaymentTransaction160 setAccptncDtTm(XMLGregorianCalendar value) {
        this.accptncDtTm = value;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        return this;
    }

    /**
     * Gets the value of the acctSvcrRef property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getInstgAgt() {
        return instgAgt;
=======
     *     {@link String }
     *     
     */
    public String getAcctSvcrRef() {
        return acctSvcrRef;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
    }

    /**
     * Sets the value of the acctSvcrRef property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public PaymentTransaction158 setInstgAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.instgAgt = value;
=======
     *     {@link String }
     *     
     */
    public PaymentTransaction160 setAcctSvcrRef(String value) {
        this.acctSvcrRef = value;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        return this;
    }

    /**
     * Gets the value of the clrSysRef property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getInstdAgt() {
        return instdAgt;
=======
     *     {@link String }
     *     
     */
    public String getClrSysRef() {
        return clrSysRef;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
    }

    /**
     * Sets the value of the clrSysRef property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public PaymentTransaction158 setInstdAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.instdAgt = value;
=======
     *     {@link String }
     *     
     */
    public PaymentTransaction160 setClrSysRef(String value) {
        this.clrSysRef = value;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        return this;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference42 }
     *     
     */
    public OriginalTransactionReference42 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference42 }
     *     
     */
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
    public PaymentTransaction158 setOrgnlTxRef(OriginalTransactionReference42 value) {
=======
    public PaymentTransaction160 setOrgnlTxRef(OriginalTransactionReference42 value) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        this.orgnlTxRef = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
=======
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
=======
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        }
        return this.splmtryData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
<<<<<<< HEAD:model-pacs-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction158.java
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public PaymentTransaction158 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
=======
     * Adds a new item to the stsRsnInf list.
     * @see #getStsRsnInf()
     * 
     */
    public PaymentTransaction160 addStsRsnInf(StatusReasonInformation14 stsRsnInf) {
        getStsRsnInf().add(stsRsnInf);
        return this;
    }

    /**
     * Adds a new item to the chrgsInf list.
     * @see #getChrgsInf()
     * 
     */
    public PaymentTransaction160 addChrgsInf(Charges16 chrgsInf) {
        getChrgsInf().add(chrgsInf);
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PaymentTransaction160.java
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public PaymentTransaction160 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
