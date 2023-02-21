
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Detailed information about single invoice/instalment financing result, such as result of request (financed or not financed), amount, percentage applied.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFinancingDetails1", propOrder = {
    "orgnlInvcInf",
    "spplr",
    "invcFincgRslt",
    "instlmtFincgInf"
})
public class InvoiceFinancingDetails1 {

    @XmlElement(name = "OrgnlInvcInf", required = true)
    protected OriginalInvoiceInformation1 orgnlInvcInf;
    @XmlElement(name = "Spplr")
    protected PartyIdentification8 spplr;
    @XmlElement(name = "InvcFincgRslt", required = true)
    protected FinancingResult1 invcFincgRslt;
    @XmlElement(name = "InstlmtFincgInf")
    protected List<InstalmentFinancingInformation1> instlmtFincgInf;

    /**
     * Gets the value of the orgnlInvcInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalInvoiceInformation1 }
     *     
     */
    public OriginalInvoiceInformation1 getOrgnlInvcInf() {
        return orgnlInvcInf;
    }

    /**
     * Sets the value of the orgnlInvcInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalInvoiceInformation1 }
     *     
     */
    public InvoiceFinancingDetails1 setOrgnlInvcInf(OriginalInvoiceInformation1 value) {
        this.orgnlInvcInf = value;
        return this;
    }

    /**
     * Gets the value of the spplr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getSpplr() {
        return spplr;
    }

    /**
     * Sets the value of the spplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public InvoiceFinancingDetails1 setSpplr(PartyIdentification8 value) {
        this.spplr = value;
        return this;
    }

    /**
     * Gets the value of the invcFincgRslt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingResult1 }
     *     
     */
    public FinancingResult1 getInvcFincgRslt() {
        return invcFincgRslt;
    }

    /**
     * Sets the value of the invcFincgRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingResult1 }
     *     
     */
    public InvoiceFinancingDetails1 setInvcFincgRslt(FinancingResult1 value) {
        this.invcFincgRslt = value;
        return this;
    }

    /**
     * Gets the value of the instlmtFincgInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instlmtFincgInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtFincgInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalmentFinancingInformation1 }
     * 
     * 
     */
    public List<InstalmentFinancingInformation1> getInstlmtFincgInf() {
        if (instlmtFincgInf == null) {
            instlmtFincgInf = new ArrayList<InstalmentFinancingInformation1>();
        }
        return this.instlmtFincgInf;
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
     * Adds a new item to the instlmtFincgInf list.
     * @see #getInstlmtFincgInf()
     * 
     */
    public InvoiceFinancingDetails1 addInstlmtFincgInf(InstalmentFinancingInformation1 instlmtFincgInf) {
        getInstlmtFincgInf().add(instlmtFincgInf);
        return this;
    }

}
