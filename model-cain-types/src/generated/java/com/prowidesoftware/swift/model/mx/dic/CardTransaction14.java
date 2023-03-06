
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
 * Key exchange transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction14", propOrder = {
    "keyXchgTp",
    "initrDtTm",
    "keyVrfctn",
    "key",
    "txRspn"
})
public class CardTransaction14 {

    @XmlElement(name = "KeyXchgTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType3Code keyXchgTp;
    @XmlElement(name = "InitrDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initrDtTm;
    @XmlElement(name = "KeyVrfctn")
    protected List<KEKIdentifier3> keyVrfctn;
    @XmlElement(name = "Key")
    protected List<CryptographicKey6> key;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType2 txRspn;

    /**
     * Gets the value of the keyXchgTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardServiceType3Code }
     *     
     */
    public CardServiceType3Code getKeyXchgTp() {
        return keyXchgTp;
    }

    /**
     * Sets the value of the keyXchgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardServiceType3Code }
     *     
     */
    public CardTransaction14 setKeyXchgTp(CardServiceType3Code value) {
        this.keyXchgTp = value;
        return this;
    }

    /**
     * Gets the value of the initrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getInitrDtTm() {
        return initrDtTm;
    }

    /**
     * Sets the value of the initrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction14 setInitrDtTm(XMLGregorianCalendar value) {
        this.initrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the keyVrfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyVrfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyVrfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier3 }
     * 
     * 
     */
    public List<KEKIdentifier3> getKeyVrfctn() {
        if (keyVrfctn == null) {
            keyVrfctn = new ArrayList<KEKIdentifier3>();
        }
        return this.keyVrfctn;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptographicKey6 }
     * 
     * 
     */
    public List<CryptographicKey6> getKey() {
        if (key == null) {
            key = new ArrayList<CryptographicKey6>();
        }
        return this.key;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType2 }
     *     
     */
    public ResponseType2 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType2 }
     *     
     */
    public CardTransaction14 setTxRspn(ResponseType2 value) {
        this.txRspn = value;
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
     * Adds a new item to the keyVrfctn list.
     * @see #getKeyVrfctn()
     * 
     */
    public CardTransaction14 addKeyVrfctn(KEKIdentifier3 keyVrfctn) {
        getKeyVrfctn().add(keyVrfctn);
        return this;
    }

    /**
     * Adds a new item to the key list.
     * @see #getKey()
     * 
     */
    public CardTransaction14 addKey(CryptographicKey6 key) {
        getKey().add(key);
        return this;
    }

}
