
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for SessionDetails complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionDetails", propOrder = {
    "snFSessionId",
    "subset",
    "snlId",
    "acqrDN"
})
public class SessionDetails {

    @XmlElement(name = "SnFSessionId", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFSessionId;
    @XmlElement(name = "Subset", namespace = "urn:swift:snl:ns.Sw")
    protected List<String> subset;
    @XmlElement(name = "SNLId", namespace = "urn:swift:snl:ns.SwInt")
    protected String snlId;
    @XmlElement(name = "AcqrDN")
    protected String acqrDN;

    /**
     * StoreAndForwardSessionId
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFSessionId() {
        return snFSessionId;
    }

    /**
     * Sets the value of the snFSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SessionDetails setSnFSessionId(String value) {
        this.snFSessionId = value;
        return this;
    }

    /**
     * Subset Gets the value of the subset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubset() {
        if (subset == null) {
            subset = new ArrayList<String>();
        }
        return this.subset;
    }

    /**
     * SNLIdentifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLId() {
        return snlId;
    }

    /**
     * Sets the value of the snlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SessionDetails setSNLId(String value) {
        this.snlId = value;
        return this;
    }

    /**
     * Gets the value of the acqrDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrDN() {
        return acqrDN;
    }

    /**
     * Sets the value of the acqrDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SessionDetails setAcqrDN(String value) {
        this.acqrDN = value;
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
     * Adds a new item to the subset list.
     * @see #getSubset()
     * 
     */
    public SessionDetails addSubset(String subset) {
        getSubset().add(subset);
        return this;
    }

}
