
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
 * Provides details on the margin call, that is a description and a response type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response1", propOrder = {
    "rspnTpDtls",
    "desc"
})
public class Response1 {

    @XmlElement(name = "RspnTpDtls", required = true)
    protected List<ResponseType1Choice> rspnTpDtls;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the rspnTpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rspnTpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnTpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType1Choice }
     * 
     * 
     * @return
     *     The value of the rspnTpDtls property.
     */
    public List<ResponseType1Choice> getRspnTpDtls() {
        if (rspnTpDtls == null) {
            rspnTpDtls = new ArrayList<>();
        }
        return this.rspnTpDtls;
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
    public Response1 setDesc(String value) {
        this.desc = value;
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
     * Adds a new item to the rspnTpDtls list.
     * @see #getRspnTpDtls()
     * 
     */
    public Response1 addRspnTpDtls(ResponseType1Choice rspnTpDtls) {
        getRspnTpDtls().add(rspnTpDtls);
        return this;
    }

}
