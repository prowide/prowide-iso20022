
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
 * Java class for Connectivity complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Connectivity", propOrder = {
    "connectivityStatus",
    "domainConnection"
})
public class SwConnectivity {

    @XmlElement(name = "ConnectivityStatus", required = true)
    protected String connectivityStatus;
    @XmlElement(name = "DomainConnection")
    protected List<SwDomainConnection> domainConnection;

    /**
     * Gets the value of the connectivityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectivityStatus() {
        return connectivityStatus;
    }

    /**
     * Sets the value of the connectivityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwConnectivity setConnectivityStatus(String value) {
        this.connectivityStatus = value;
        return this;
    }

    /**
     * Gets the value of the domainConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwDomainConnection }
     * 
     * 
     */
    public List<SwDomainConnection> getDomainConnection() {
        if (domainConnection == null) {
            domainConnection = new ArrayList<SwDomainConnection>();
        }
        return this.domainConnection;
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
     * Adds a new item to the domainConnection list.
     * @see #getDomainConnection()
     * 
     */
    public SwConnectivity addDomainConnection(SwDomainConnection domainConnection) {
        getDomainConnection().add(domainConnection);
        return this;
    }

}
