
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
 * Details of the processing request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails19", propOrder = {
    "tp",
    "rqstrId",
    "addtlReqInf"
})
public class RequestDetails19 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "RqstrId")
    protected PartyIdentification73Choice rqstrId;
    @XmlElement(name = "AddtlReqInf")
    protected List<String> addtlReqInf;

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
    public RequestDetails19 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rqstrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getRqstrId() {
        return rqstrId;
    }

    /**
     * Sets the value of the rqstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public RequestDetails19 setRqstrId(PartyIdentification73Choice value) {
        this.rqstrId = value;
        return this;
    }

    /**
     * Gets the value of the addtlReqInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlReqInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlReqInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlReqInf() {
        if (addtlReqInf == null) {
            addtlReqInf = new ArrayList<String>();
        }
        return this.addtlReqInf;
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
     * Adds a new item to the addtlReqInf list.
     * @see #getAddtlReqInf()
     * 
     */
    public RequestDetails19 addAddtlReqInf(String addtlReqInf) {
        getAddtlReqInf().add(addtlReqInf);
        return this;
    }

}
