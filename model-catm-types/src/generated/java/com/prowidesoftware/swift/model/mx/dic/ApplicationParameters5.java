
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "ApplicationParameters5", propOrder = {
    "actnTp",
    "applId",
    "vrsn",
    "params",
    "ncrptdParams"
})
public class ApplicationParameters5 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "ApplId", required = true)
    protected String applId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "Params")
    protected List<byte[]> params;
    @XmlElement(name = "NcrptdParams")
    protected ContentInformationType10 ncrptdParams;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public ApplicationParameters5 setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
        return this;
    }

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
    public ApplicationParameters5 setApplId(String value) {
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
    public ApplicationParameters5 setVrsn(String value) {
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
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getNcrptdParams() {
        return ncrptdParams;
    }

    /**
     * Sets the value of the ncrptdParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ApplicationParameters5 setNcrptdParams(ContentInformationType10 value) {
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
    public ApplicationParameters5 addParams(byte[] params) {
        getParams().add(params);
        return this;
    }

}
