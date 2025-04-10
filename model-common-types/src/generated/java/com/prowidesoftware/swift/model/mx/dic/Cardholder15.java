
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Unprotected sensitive detailed information about the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cardholder15", propOrder = {
    "crdhldrNm",
    "id",
    "adr",
    "ctctInf",
    "dtOfBirth"
})
public class Cardholder15 {

    @XmlElement(name = "CrdhldrNm")
    protected CardholderName1 crdhldrNm;
    @XmlElement(name = "Id")
    protected List<Credentials1> id;
    @XmlElement(name = "Adr")
    protected Address1 adr;
    @XmlElement(name = "CtctInf")
    protected Contact1 ctctInf;
    @XmlElement(name = "DtOfBirth", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtOfBirth;

    /**
     * Gets the value of the crdhldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName1 }
     *     
     */
    public CardholderName1 getCrdhldrNm() {
        return crdhldrNm;
    }

    /**
     * Sets the value of the crdhldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName1 }
     *     
     */
    public Cardholder15 setCrdhldrNm(CardholderName1 value) {
        this.crdhldrNm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Credentials1 }
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<Credentials1> getId() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public Cardholder15 setAdr(Address1 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the ctctInf property.
     * 
     * @return
     *     possible object is
     *     {@link Contact1 }
     *     
     */
    public Contact1 getCtctInf() {
        return ctctInf;
    }

    /**
     * Sets the value of the ctctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact1 }
     *     
     */
    public Cardholder15 setCtctInf(Contact1 value) {
        this.ctctInf = value;
        return this;
    }

    /**
     * Gets the value of the dtOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtOfBirth() {
        return dtOfBirth;
    }

    /**
     * Sets the value of the dtOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder15 setDtOfBirth(LocalDate value) {
        this.dtOfBirth = value;
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
     * Adds a new item to the id list.
     * @see #getId()
     * 
     */
    public Cardholder15 addId(Credentials1 id) {
        getId().add(id);
        return this;
    }

}
