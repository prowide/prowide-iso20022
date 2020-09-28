
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes the type of product and the assets to be transferred.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PEPISATransfer4", propOrder = {
    "mstrRef",
    "trfConfId",
    "trfInstrRef",
    "actlTrfDt",
    "rsdlCshInd",
    "isa",
    "pep",
    "prtfl",
    "finInstrmAsstForTrf"
})
public class PEPISATransfer4 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfConfId", required = true)
    protected String trfConfId;
    @XmlElement(name = "TrfInstrRef", required = true)
    protected String trfInstrRef;
    @XmlElement(name = "ActlTrfDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actlTrfDt;
    @XmlElement(name = "RsdlCshInd")
    protected boolean rsdlCshInd;
    @XmlElement(name = "ISA")
    protected ISAYearsOfIssue3 isa;
    @XmlElement(name = "PEP")
    protected PreviousYearChoice pep;
    @XmlElement(name = "Prtfl")
    protected Portfolio1 prtfl;
    @XmlElement(name = "FinInstrmAsstForTrf")
    protected List<FinancialInstrument11> finInstrmAsstForTrf;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PEPISATransfer4 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfConfId() {
        return trfConfId;
    }

    /**
     * Sets the value of the trfConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PEPISATransfer4 setTrfConfId(String value) {
        this.trfConfId = value;
        return this;
    }

    /**
     * Gets the value of the trfInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfInstrRef() {
        return trfInstrRef;
    }

    /**
     * Sets the value of the trfInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PEPISATransfer4 setTrfInstrRef(String value) {
        this.trfInstrRef = value;
        return this;
    }

    /**
     * Gets the value of the actlTrfDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActlTrfDt() {
        return actlTrfDt;
    }

    /**
     * Sets the value of the actlTrfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PEPISATransfer4 setActlTrfDt(XMLGregorianCalendar value) {
        this.actlTrfDt = value;
        return this;
    }

    /**
     * Gets the value of the rsdlCshInd property.
     * 
     */
    public boolean isRsdlCshInd() {
        return rsdlCshInd;
    }

    /**
     * Sets the value of the rsdlCshInd property.
     * 
     */
    public PEPISATransfer4 setRsdlCshInd(boolean value) {
        this.rsdlCshInd = value;
        return this;
    }

    /**
     * Gets the value of the isa property.
     * 
     * @return
     *     possible object is
     *     {@link ISAYearsOfIssue3 }
     *     
     */
    public ISAYearsOfIssue3 getISA() {
        return isa;
    }

    /**
     * Sets the value of the isa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAYearsOfIssue3 }
     *     
     */
    public PEPISATransfer4 setISA(ISAYearsOfIssue3 value) {
        this.isa = value;
        return this;
    }

    /**
     * Gets the value of the pep property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYearChoice }
     *     
     */
    public PreviousYearChoice getPEP() {
        return pep;
    }

    /**
     * Sets the value of the pep property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYearChoice }
     *     
     */
    public PEPISATransfer4 setPEP(PreviousYearChoice value) {
        this.pep = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link Portfolio1 }
     *     
     */
    public Portfolio1 getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Portfolio1 }
     *     
     */
    public PEPISATransfer4 setPrtfl(Portfolio1 value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAsstForTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmAsstForTrf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAsstForTrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument11 }
     * 
     * 
     */
    public List<FinancialInstrument11> getFinInstrmAsstForTrf() {
        if (finInstrmAsstForTrf == null) {
            finInstrmAsstForTrf = new ArrayList<FinancialInstrument11>();
        }
        return this.finInstrmAsstForTrf;
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
     * Adds a new item to the finInstrmAsstForTrf list.
     * @see #getFinInstrmAsstForTrf()
     * 
     */
    public PEPISATransfer4 addFinInstrmAsstForTrf(FinancialInstrument11 finInstrmAsstForTrf) {
        getFinInstrmAsstForTrf().add(finInstrmAsstForTrf);
        return this;
    }

}
