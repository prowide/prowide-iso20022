
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for AbstractReportDescription complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractReportDescription", propOrder = {
    "rptOptn",
    "rqstrPttrn",
    "inptChanl",
    "msgSvc",
    "ctryLctn"
})
public class AbstractReportDescription {

    @XmlElement(name = "RptOptn", required = true)
    protected String rptOptn;
    @XmlElement(name = "RqstrPttrn")
    protected String rqstrPttrn;
    @XmlElement(name = "InptChanl")
    protected String inptChanl;
    @XmlElement(name = "MsgSvc")
    @XmlSchemaType(name = "string")
    protected MsgServiceCode msgSvc;
    @XmlElement(name = "CtryLctn")
    protected List<String> ctryLctn;

    /**
     * Gets the value of the rptOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOptn() {
        return rptOptn;
    }

    /**
     * Sets the value of the rptOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AbstractReportDescription setRptOptn(String value) {
        this.rptOptn = value;
        return this;
    }

    /**
     * Gets the value of the rqstrPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstrPttrn() {
        return rqstrPttrn;
    }

    /**
     * Sets the value of the rqstrPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AbstractReportDescription setRqstrPttrn(String value) {
        this.rqstrPttrn = value;
        return this;
    }

    /**
     * Gets the value of the inptChanl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInptChanl() {
        return inptChanl;
    }

    /**
     * Sets the value of the inptChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AbstractReportDescription setInptChanl(String value) {
        this.inptChanl = value;
        return this;
    }

    /**
     * Gets the value of the msgSvc property.
     * 
     * @return
     *     possible object is
     *     {@link MsgServiceCode }
     *     
     */
    public MsgServiceCode getMsgSvc() {
        return msgSvc;
    }

    /**
     * Sets the value of the msgSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgServiceCode }
     *     
     */
    public AbstractReportDescription setMsgSvc(MsgServiceCode value) {
        this.msgSvc = value;
        return this;
    }

    /**
     * Gets the value of the ctryLctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctryLctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtryLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCtryLctn() {
        if (ctryLctn == null) {
            ctryLctn = new ArrayList<String>();
        }
        return this.ctryLctn;
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
     * Adds a new item to the ctryLctn list.
     * @see #getCtryLctn()
     * 
     */
    public AbstractReportDescription addCtryLctn(String ctryLctn) {
        getCtryLctn().add(ctryLctn);
        return this;
    }

}
