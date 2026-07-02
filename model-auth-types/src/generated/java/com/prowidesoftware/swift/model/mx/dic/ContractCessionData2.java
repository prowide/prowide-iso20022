
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contract cession data in structured form.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractCessionData2", propOrder = {
    "pty",
    "docNb",
    "docDt"
})
public class ContractCessionData2 {

    @XmlElement(name = "Pty", required = true)
    protected TradeParty6 pty;
    @XmlElement(name = "DocNb")
    protected String docNb;
    @XmlElement(name = "DocDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDt;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty6 }
     *     
     */
    public TradeParty6 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty6 }
     *     
     */
    public ContractCessionData2 setPty(TradeParty6 value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractCessionData2 setDocNb(String value) {
        this.docNb = value;
        return this;
    }

    /**
     * Gets the value of the docDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDocDt() {
        return docDt;
    }

    /**
     * Sets the value of the docDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractCessionData2 setDocDt(XMLGregorianCalendar value) {
        this.docDt = value;
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

}
