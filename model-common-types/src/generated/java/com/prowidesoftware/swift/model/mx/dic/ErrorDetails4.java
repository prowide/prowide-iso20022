
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
 * Details of the error
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetails4", propOrder = {
    "errCd",
    "svrtyCd",
    "desc",
    "dataElmtInErr"
})
public class ErrorDetails4 {

    @XmlElement(name = "ErrCd", required = true)
    protected String errCd;
    protected String svrtyCd;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "DataElmtInErr")
    protected List<String> dataElmtInErr;

    /**
     * Gets the value of the errCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCd() {
        return errCd;
    }

    /**
     * Sets the value of the errCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ErrorDetails4 setErrCd(String value) {
        this.errCd = value;
        return this;
    }

    /**
     * Gets the value of the svrtyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrtyCd() {
        return svrtyCd;
    }

    /**
     * Sets the value of the svrtyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ErrorDetails4 setSvrtyCd(String value) {
        this.svrtyCd = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ErrorDetails4 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the dataElmtInErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dataElmtInErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElmtInErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dataElmtInErr property.
     */
    public List<String> getDataElmtInErr() {
        if (dataElmtInErr == null) {
            dataElmtInErr = new ArrayList<>();
        }
        return this.dataElmtInErr;
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
     * Adds a new item to the dataElmtInErr list.
     * @see #getDataElmtInErr()
     * 
     */
    public ErrorDetails4 addDataElmtInErr(String dataElmtInErr) {
        getDataElmtInErr().add(dataElmtInErr);
        return this;
    }

}
