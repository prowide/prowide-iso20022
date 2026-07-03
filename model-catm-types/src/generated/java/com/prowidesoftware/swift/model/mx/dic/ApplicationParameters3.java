
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
 * Acceptor parameters dedicated to a payment application of the point of interaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationParameters3", propOrder = {
    "applId",
    "vrsn",
    "params",
    "ncrptdParams"
})
public class ApplicationParameters3 {

    @XmlElement(name = "ApplId", required = true)
    protected String applId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "Params")
    protected List<byte[]> params;
    @XmlElement(name = "NcrptdParams")
    protected ContentInformationType7 ncrptdParams;

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ApplicationParameters3 setApplId(String value) {
        this.applId = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ApplicationParameters3 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getParams() {
        if (params == null) {
            params = new ArrayList<byte[]>();
        }
        return this.params;
    }

    /**
     * Gets the value of the ncrptdParams property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType7 }
     *     
     */
    public ContentInformationType7 getNcrptdParams() {
        return ncrptdParams;
    }

    /**
     * Sets the value of the ncrptdParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType7 }
     *     
     */
    public ApplicationParameters3 setNcrptdParams(ContentInformationType7 value) {
        this.ncrptdParams = value;
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

    /**
     * Adds a new item to the params list.
     * @see #getParams()
     * 
     */
    public ApplicationParameters3 addParams(byte[] params) {
        getParams().add(params);
        return this;
    }

}
