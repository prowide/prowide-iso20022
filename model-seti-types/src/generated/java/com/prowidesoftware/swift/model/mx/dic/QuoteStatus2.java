
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the status of a quote and if required, the rejection reason, and the parties and the details of the quote.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteStatus2", propOrder = {
    "qtSts",
    "rjctnRsn",
    "qtSetDtls",
    "rltdPties"
})
public class QuoteStatus2 {

    @XmlElement(name = "QtSts", required = true)
    @XmlSchemaType(name = "string")
    protected QuoteStatus1Code qtSts;
    @XmlElement(name = "RjctnRsn")
    @XmlSchemaType(name = "string")
    protected RejectionReason3Code rjctnRsn;
    @XmlElement(name = "QtSetDtls")
    protected List<QuoteSet2> qtSetDtls;
    @XmlElement(name = "RltdPties")
    protected List<Intermediary14> rltdPties;

    /**
     * Gets the value of the qtSts property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteStatus1Code }
     *     
     */
    public QuoteStatus1Code getQtSts() {
        return qtSts;
    }

    /**
     * Sets the value of the qtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteStatus1Code }
     *     
     */
    public QuoteStatus2 setQtSts(QuoteStatus1Code value) {
        this.qtSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason3Code }
     *     
     */
    public RejectionReason3Code getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason3Code }
     *     
     */
    public QuoteStatus2 setRjctnRsn(RejectionReason3Code value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the qtSetDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtSetDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtSetDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteSet2 }
     * 
     * 
     */
    public List<QuoteSet2> getQtSetDtls() {
        if (qtSetDtls == null) {
            qtSetDtls = new ArrayList<QuoteSet2>();
        }
        return this.qtSetDtls;
    }

    /**
     * Gets the value of the rltdPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary14 }
     * 
     * 
     */
    public List<Intermediary14> getRltdPties() {
        if (rltdPties == null) {
            rltdPties = new ArrayList<Intermediary14>();
        }
        return this.rltdPties;
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
     * Adds a new item to the qtSetDtls list.
     * @see #getQtSetDtls()
     * 
     */
    public QuoteStatus2 addQtSetDtls(QuoteSet2 qtSetDtls) {
        getQtSetDtls().add(qtSetDtls);
        return this;
    }

    /**
     * Adds a new item to the rltdPties list.
     * @see #getRltdPties()
     * 
     */
    public QuoteStatus2 addRltdPties(Intermediary14 rltdPties) {
        getRltdPties().add(rltdPties);
        return this;
    }

}
