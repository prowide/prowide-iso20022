
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
 * Data related specifically to counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyData49", propOrder = {
    "rptgDtTm",
    "rptSubmitgNtty",
    "ctrPtyData"
})
public class CounterpartyData49 {

    @XmlElement(name = "RptgDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgDtTm;
    @XmlElement(name = "RptSubmitgNtty", required = true)
    protected OrganisationIdentification9Choice rptSubmitgNtty;
    @XmlElement(name = "CtrPtyData", required = true)
    protected List<CounterpartyData50> ctrPtyData;

    /**
     * Gets the value of the rptgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgDtTm() {
        return rptgDtTm;
    }

    /**
     * Sets the value of the rptgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CounterpartyData49 setRptgDtTm(XMLGregorianCalendar value) {
        this.rptgDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rptSubmitgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getRptSubmitgNtty() {
        return rptSubmitgNtty;
    }

    /**
     * Sets the value of the rptSubmitgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public CounterpartyData49 setRptSubmitgNtty(OrganisationIdentification9Choice value) {
        this.rptSubmitgNtty = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrPtyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterpartyData50 }
     * 
     * 
     */
    public List<CounterpartyData50> getCtrPtyData() {
        if (ctrPtyData == null) {
            ctrPtyData = new ArrayList<CounterpartyData50>();
        }
        return this.ctrPtyData;
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
     * Adds a new item to the ctrPtyData list.
     * @see #getCtrPtyData()
     * 
     */
    public CounterpartyData49 addCtrPtyData(CounterpartyData50 ctrPtyData) {
        getCtrPtyData().add(ctrPtyData);
        return this;
    }

}
