
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
 * Details of the error
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetails3", propOrder = {
    "tp",
    "othrTp",
    "cd",
    "desc",
    "dataElmtInErr"
})
public class ErrorDetails3 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MessageError1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "DataElmtInErr")
    protected List<String> dataElmtInErr;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MessageError1Code }
     *     
     */
    public MessageError1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageError1Code }
     *     
     */
    public ErrorDetails3 setTp(MessageError1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ErrorDetails3 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ErrorDetails3 setCd(String value) {
        this.cd = value;
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
    public ErrorDetails3 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the dataElmtInErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataElmtInErr property.
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
     */
    public List<String> getDataElmtInErr() {
        if (dataElmtInErr == null) {
            dataElmtInErr = new ArrayList<String>();
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
    public ErrorDetails3 addDataElmtInErr(String dataElmtInErr) {
        getDataElmtInErr().add(dataElmtInErr);
        return this;
    }

}
