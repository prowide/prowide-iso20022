
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
 * Status information of the report item.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportItemStatus1", propOrder = {
    "xcptn",
    "addtlRsnInf",
    "rptItm"
})
public class ReportItemStatus1 {

    @XmlElement(name = "Xcptn", required = true)
    protected ReportItemRejectionReason1Choice xcptn;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;
    @XmlElement(name = "RptItm")
    protected List<ReportItem1> rptItm;

    /**
     * Gets the value of the xcptn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportItemRejectionReason1Choice }
     *     
     */
    public ReportItemRejectionReason1Choice getXcptn() {
        return xcptn;
    }

    /**
     * Sets the value of the xcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportItemRejectionReason1Choice }
     *     
     */
    public ReportItemStatus1 setXcptn(ReportItemRejectionReason1Choice value) {
        this.xcptn = value;
        return this;
    }

    /**
     * Gets the value of the addtlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Sets the value of the addtlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportItemStatus1 setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
        return this;
    }

    /**
     * Gets the value of the rptItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportItem1 }
     * 
     * 
     */
    public List<ReportItem1> getRptItm() {
        if (rptItm == null) {
            rptItm = new ArrayList<ReportItem1>();
        }
        return this.rptItm;
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
     * Adds a new item to the rptItm list.
     * @see #getRptItm()
     * 
     */
    public ReportItemStatus1 addRptItm(ReportItem1 rptItm) {
        getRptItm().add(rptItm);
        return this;
    }

}
