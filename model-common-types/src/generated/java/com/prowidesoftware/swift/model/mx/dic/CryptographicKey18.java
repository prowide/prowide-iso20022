
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
 * Cryptographic Key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicKey18", propOrder = {
    "id",
    "addtlId",
    "nm",
    "sctyPrfl",
    "itmNb",
    "vrsn",
    "tp",
    "fctn",
    "actvtnDt",
    "deactvtnDt",
    "keyVal",
    "cmpntWthAuthrsdAccs",
    "prtctdCmpntWthAuthrsdAccs",
    "keyChckVal",
    "addtlMgmtInf"
})
public class CryptographicKey18 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AddtlId")
    protected byte[] addtlId;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;
    @XmlElement(name = "ItmNb")
    protected String itmNb;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CryptographicKeyType3Code tp;
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
    public CryptographicKey18 setId(String value) {
        this.id = value;
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
    public CryptographicKey18 setAddtlId(byte[] value) {
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
    public CryptographicKey18 setNm(String value) {
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
    public CryptographicKey18 setSctyPrfl(String value) {
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
    public CryptographicKey18 setItmNb(String value) {
        this.itmNb = value;
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
    public CryptographicKey18 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKeyType3Code }
     *     
     */
    public CryptographicKeyType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKeyType3Code }
     *     
     */
    public CryptographicKey18 setTp(CryptographicKeyType3Code value) {
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
    public CryptographicKey18 setActvtnDt(OffsetDateTime value) {
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
    public CryptographicKey18 setDeactvtnDt(OffsetDateTime value) {
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
    public CryptographicKey18 setKeyVal(ContentInformationType39 value) {
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
    public CryptographicKey18 setKeyChckVal(byte[] value) {
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
    public CryptographicKey18 addFctn(KeyUsage1Code fctn) {
        getFctn().add(fctn);
        return this;
    }

    /**
     * Adds a new item to the cmpntWthAuthrsdAccs list.
     * @see #getCmpntWthAuthrsdAccs()
     * 
     */
    public CryptographicKey18 addCmpntWthAuthrsdAccs(GenericIdentification186 cmpntWthAuthrsdAccs) {
        getCmpntWthAuthrsdAccs().add(cmpntWthAuthrsdAccs);
        return this;
    }

    /**
     * Adds a new item to the prtctdCmpntWthAuthrsdAccs list.
     * @see #getPrtctdCmpntWthAuthrsdAccs()
     * 
     */
    public CryptographicKey18 addPrtctdCmpntWthAuthrsdAccs(ContentInformationType39 prtctdCmpntWthAuthrsdAccs) {
        getPrtctdCmpntWthAuthrsdAccs().add(prtctdCmpntWthAuthrsdAccs);
        return this;
    }

    /**
     * Adds a new item to the addtlMgmtInf list.
     * @see #getAddtlMgmtInf()
     * 
     */
    public CryptographicKey18 addAddtlMgmtInf(GenericInformation1 addtlMgmtInf) {
        getAddtlMgmtInf().add(addtlMgmtInf);
        return this;
    }

}
