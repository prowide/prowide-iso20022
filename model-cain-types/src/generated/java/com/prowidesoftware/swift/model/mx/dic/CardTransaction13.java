
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
 * Key exchange transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction13", propOrder = {
    "keyXchgTp",
    "initrDtTm",
    "reqdKey",
    "key",
    "txRspn"
})
public class CardTransaction13 {

    @XmlElement(name = "KeyXchgTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType3Code keyXchgTp;
    @XmlElement(name = "InitrDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime initrDtTm;
    @XmlElement(name = "ReqdKey")
    protected List<KEKIdentifier3> reqdKey;
    @XmlElement(name = "Key")
    protected List<CryptographicKey6> key;
    @XmlElement(name = "TxRspn")
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
    public CardTransaction13 setKeyXchgTp(CardServiceType3Code value) {
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
    public OffsetDateTime getInitrDtTm() {
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
    public CardTransaction13 setInitrDtTm(OffsetDateTime value) {
        this.initrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the reqdKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier3 }
     * 
     * 
     * @return
     *     The value of the reqdKey property.
     */
    public List<KEKIdentifier3> getReqdKey() {
        if (reqdKey == null) {
            reqdKey = new ArrayList<>();
        }
        return this.reqdKey;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the key property.
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
     * @return
     *     The value of the key property.
     */
    public List<CryptographicKey6> getKey() {
        if (key == null) {
            key = new ArrayList<>();
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
    public CardTransaction13 setTxRspn(ResponseType2 value) {
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
     * Adds a new item to the reqdKey list.
     * @see #getReqdKey()
     * 
     */
    public CardTransaction13 addReqdKey(KEKIdentifier3 reqdKey) {
        getReqdKey().add(reqdKey);
        return this;
    }

    /**
     * Adds a new item to the key list.
     * @see #getKey()
     * 
     */
    public CardTransaction13 addKey(CryptographicKey6 key) {
        getKey().add(key);
        return this;
    }

}
