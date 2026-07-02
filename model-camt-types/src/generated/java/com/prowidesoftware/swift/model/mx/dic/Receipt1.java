
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
 * Provides details on the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receipt1", propOrder = {
    "orgnlMsgId",
    "reqHdlg"
})
public class Receipt1 {

    @XmlElement(name = "OrgnlMsgId", required = true)
    protected OriginalMessageAndIssuer1 orgnlMsgId;
    @XmlElement(name = "ReqHdlg")
    protected List<RequestHandling> reqHdlg;

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessageAndIssuer1 }
     *     
     */
    public OriginalMessageAndIssuer1 getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessageAndIssuer1 }
     *     
     */
    public Receipt1 setOrgnlMsgId(OriginalMessageAndIssuer1 value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the reqHdlg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqHdlg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqHdlg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestHandling }
     * 
     * 
     */
    public List<RequestHandling> getReqHdlg() {
        if (reqHdlg == null) {
            reqHdlg = new ArrayList<RequestHandling>();
        }
        return this.reqHdlg;
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
     * Adds a new item to the reqHdlg list.
     * @see #getReqHdlg()
     * 
     */
    public Receipt1 addReqHdlg(RequestHandling reqHdlg) {
        getReqHdlg().add(reqHdlg);
        return this;
    }

}
