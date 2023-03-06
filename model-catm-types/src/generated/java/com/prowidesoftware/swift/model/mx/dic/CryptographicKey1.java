
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Cryptographic Key to exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicKey1", propOrder = {
    "id",
    "addtlId",
    "vrsn",
    "tp",
    "fctn",
    "actvtnDt",
    "deactvtnDt",
    "keyVal"
})
public class CryptographicKey1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AddtlId")
    protected byte[] addtlId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CryptographicKeyType1Code tp;
    @XmlElement(name = "Fctn", required = true)
    @XmlSchemaType(name = "string")
    protected List<KeyUsage1Code> fctn;
    @XmlElement(name = "ActvtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actvtnDt;
    @XmlElement(name = "DeactvtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactvtnDt;
    @XmlElement(name = "KeyVal", required = true)
    protected ContentInformationType2 keyVal;

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
    public CryptographicKey1 setId(String value) {
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
    public CryptographicKey1 setAddtlId(byte[] value) {
        this.addtlId = value;
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
    public CryptographicKey1 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKeyType1Code }
     *     
     */
    public CryptographicKeyType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKeyType1Code }
     *     
     */
    public CryptographicKey1 setTp(CryptographicKeyType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the fctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fctn property.
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
     */
    public List<KeyUsage1Code> getFctn() {
        if (fctn == null) {
            fctn = new ArrayList<KeyUsage1Code>();
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
    public XMLGregorianCalendar getActvtnDt() {
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
    public CryptographicKey1 setActvtnDt(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getDeactvtnDt() {
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
    public CryptographicKey1 setDeactvtnDt(XMLGregorianCalendar value) {
        this.deactvtnDt = value;
        return this;
    }

    /**
     * Gets the value of the keyVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType2 }
     *     
     */
    public ContentInformationType2 getKeyVal() {
        return keyVal;
    }

    /**
     * Sets the value of the keyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType2 }
     *     
     */
    public CryptographicKey1 setKeyVal(ContentInformationType2 value) {
        this.keyVal = value;
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
    public CryptographicKey1 addFctn(KeyUsage1Code fctn) {
        getFctn().add(fctn);
        return this;
    }

}
