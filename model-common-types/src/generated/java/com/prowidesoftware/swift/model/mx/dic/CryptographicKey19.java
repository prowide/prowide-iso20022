
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Cryptographic Key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicKey19", propOrder = {
    "id",
    "keyId",
    "addtlId",
    "nm",
    "sctyPrfl",
    "itmNb",
    "seqNb",
    "vrsn",
    "keyVrsn",
    "tp",
    "fctn",
    "actvtnDt",
    "deactvtnDt",
    "keyVal",
    "cmpntWthAuthrsdAccs",
    "prtctdCmpntWthAuthrsdAccs",
    "keyChckVal",
    "addtlMgmtInf",
    "derivtnAlgoIdr",
    "algoIdr"
})
public class CryptographicKey19 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "KeyId")
    protected String keyId;
    @XmlElement(name = "AddtlId")
    protected byte[] addtlId;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;
    @XmlElement(name = "ItmNb")
    protected String itmNb;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "KeyVrsn")
    protected String keyVrsn;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CryptographicKeyType5Code tp;
    @XmlElement(name = "Fctn")
    @XmlSchemaType(name = "string")
    protected List<KeyUsage1Code> fctn;
    @XmlElement(name = "ActvtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime actvtnDt;
    @XmlElement(name = "DeactvtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime deactvtnDt;
    @XmlElement(name = "KeyVal")
    protected ContentInformationType39 keyVal;
    @XmlElement(name = "CmpntWthAuthrsdAccs")
    protected List<GenericIdentification186> cmpntWthAuthrsdAccs;
    @XmlElement(name = "PrtctdCmpntWthAuthrsdAccs")
    protected List<ContentInformationType39> prtctdCmpntWthAuthrsdAccs;
    @XmlElement(name = "KeyChckVal")
    protected byte[] keyChckVal;
    @XmlElement(name = "AddtlMgmtInf")
    protected List<GenericInformation1> addtlMgmtInf;
    @XmlElement(name = "DerivtnAlgoIdr")
    protected String derivtnAlgoIdr;
    @XmlElement(name = "AlgoIdr")
    protected String algoIdr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setKeyId(String value) {
        this.keyId = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CryptographicKey19 setAddtlId(byte[] value) {
        this.addtlId = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the sctyPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyPrfl() {
        return sctyPrfl;
    }

    /**
     * Sets the value of the sctyPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setSctyPrfl(String value) {
        this.sctyPrfl = value;
        return this;
    }

    /**
     * Gets the value of the itmNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmNb() {
        return itmNb;
    }

    /**
     * Sets the value of the itmNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setItmNb(String value) {
        this.itmNb = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CryptographicKey19 setSeqNb(BigDecimal value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the keyVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyVrsn() {
        return keyVrsn;
    }

    /**
     * Sets the value of the keyVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setKeyVrsn(String value) {
        this.keyVrsn = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKeyType5Code }
     *     
     */
    public CryptographicKeyType5Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKeyType5Code }
     *     
     */
    public CryptographicKey19 setTp(CryptographicKeyType5Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the fctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyUsage1Code }
     * 
     * 
     * @return
     *     The value of the fctn property.
     */
    public List<KeyUsage1Code> getFctn() {
        if (fctn == null) {
            fctn = new ArrayList<>();
        }
        return this.fctn;
    }

    /**
     * Gets the value of the actvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getActvtnDt() {
        return actvtnDt;
    }

    /**
     * Sets the value of the actvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setActvtnDt(OffsetDateTime value) {
        this.actvtnDt = value;
        return this;
    }

    /**
     * Gets the value of the deactvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDeactvtnDt() {
        return deactvtnDt;
    }

    /**
     * Sets the value of the deactvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setDeactvtnDt(OffsetDateTime value) {
        this.deactvtnDt = value;
        return this;
    }

    /**
     * Gets the value of the keyVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType39 }
     *     
     */
    public ContentInformationType39 getKeyVal() {
        return keyVal;
    }

    /**
     * Sets the value of the keyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType39 }
     *     
     */
    public CryptographicKey19 setKeyVal(ContentInformationType39 value) {
        this.keyVal = value;
        return this;
    }

    /**
     * Gets the value of the cmpntWthAuthrsdAccs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmpntWthAuthrsdAccs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpntWthAuthrsdAccs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification186 }
     * 
     * 
     * @return
     *     The value of the cmpntWthAuthrsdAccs property.
     */
    public List<GenericIdentification186> getCmpntWthAuthrsdAccs() {
        if (cmpntWthAuthrsdAccs == null) {
            cmpntWthAuthrsdAccs = new ArrayList<>();
        }
        return this.cmpntWthAuthrsdAccs;
    }

    /**
     * Gets the value of the prtctdCmpntWthAuthrsdAccs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtctdCmpntWthAuthrsdAccs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctdCmpntWthAuthrsdAccs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentInformationType39 }
     * 
     * 
     * @return
     *     The value of the prtctdCmpntWthAuthrsdAccs property.
     */
    public List<ContentInformationType39> getPrtctdCmpntWthAuthrsdAccs() {
        if (prtctdCmpntWthAuthrsdAccs == null) {
            prtctdCmpntWthAuthrsdAccs = new ArrayList<>();
        }
        return this.prtctdCmpntWthAuthrsdAccs;
    }

    /**
     * Gets the value of the keyChckVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyChckVal() {
        return keyChckVal;
    }

    /**
     * Sets the value of the keyChckVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CryptographicKey19 setKeyChckVal(byte[] value) {
        this.keyChckVal = value;
        return this;
    }

    /**
     * Gets the value of the addtlMgmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlMgmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlMgmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericInformation1 }
     * 
     * 
     * @return
     *     The value of the addtlMgmtInf property.
     */
    public List<GenericInformation1> getAddtlMgmtInf() {
        if (addtlMgmtInf == null) {
            addtlMgmtInf = new ArrayList<>();
        }
        return this.addtlMgmtInf;
    }

    /**
     * Gets the value of the derivtnAlgoIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivtnAlgoIdr() {
        return derivtnAlgoIdr;
    }

    /**
     * Sets the value of the derivtnAlgoIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setDerivtnAlgoIdr(String value) {
        this.derivtnAlgoIdr = value;
        return this;
    }

    /**
     * Gets the value of the algoIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgoIdr() {
        return algoIdr;
    }

    /**
     * Sets the value of the algoIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey19 setAlgoIdr(String value) {
        this.algoIdr = value;
        return this;
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
     * Adds a new item to the fctn list.
     * @see #getFctn()
     * 
     */
    public CryptographicKey19 addFctn(KeyUsage1Code fctn) {
        getFctn().add(fctn);
        return this;
    }

    /**
     * Adds a new item to the cmpntWthAuthrsdAccs list.
     * @see #getCmpntWthAuthrsdAccs()
     * 
     */
    public CryptographicKey19 addCmpntWthAuthrsdAccs(GenericIdentification186 cmpntWthAuthrsdAccs) {
        getCmpntWthAuthrsdAccs().add(cmpntWthAuthrsdAccs);
        return this;
    }

    /**
     * Adds a new item to the prtctdCmpntWthAuthrsdAccs list.
     * @see #getPrtctdCmpntWthAuthrsdAccs()
     * 
     */
    public CryptographicKey19 addPrtctdCmpntWthAuthrsdAccs(ContentInformationType39 prtctdCmpntWthAuthrsdAccs) {
        getPrtctdCmpntWthAuthrsdAccs().add(prtctdCmpntWthAuthrsdAccs);
        return this;
    }

    /**
     * Adds a new item to the addtlMgmtInf list.
     * @see #getAddtlMgmtInf()
     * 
     */
    public CryptographicKey19 addAddtlMgmtInf(GenericInformation1 addtlMgmtInf) {
        getAddtlMgmtInf().add(addtlMgmtInf);
        return this;
    }

}
