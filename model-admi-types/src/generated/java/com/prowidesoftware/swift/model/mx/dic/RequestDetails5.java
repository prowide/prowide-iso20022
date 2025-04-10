
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Report of the requested data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails5", propOrder = {
    "tp",
    "reqRef",
    "rptKey"
})
public class RequestDetails5 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "ReqRef", required = true)
    protected String reqRef;
    @XmlElement(name = "RptKey", required = true)
    protected List<RequestDetails4> rptKey;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestDetails5 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestDetails5 setReqRef(String value) {
        this.reqRef = value;
        return this;
    }

    /**
     * Gets the value of the rptKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestDetails4 }
     * 
     * 
     */
    public List<RequestDetails4> getRptKey() {
        if (rptKey == null) {
            rptKey = new ArrayList<RequestDetails4>();
        }
        return this.rptKey;
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
     * Adds a new item to the rptKey list.
     * @see #getRptKey()
     * 
     */
    public RequestDetails5 addRptKey(RequestDetails4 rptKey) {
        getRptKey().add(rptKey);
        return this;
    }

}
