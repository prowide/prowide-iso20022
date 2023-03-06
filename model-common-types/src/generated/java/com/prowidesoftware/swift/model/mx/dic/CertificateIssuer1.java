
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
 * Certificate issuer name (see X.509).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateIssuer1", propOrder = {
    "rltvDstngshdNm"
})
public class CertificateIssuer1 {

    @XmlElement(name = "RltvDstngshdNm", required = true)
    protected List<RelativeDistinguishedName1> rltvDstngshdNm;

    /**
     * Gets the value of the rltvDstngshdNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltvDstngshdNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltvDstngshdNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativeDistinguishedName1 }
     * 
     * 
     */
    public List<RelativeDistinguishedName1> getRltvDstngshdNm() {
        if (rltvDstngshdNm == null) {
            rltvDstngshdNm = new ArrayList<RelativeDistinguishedName1>();
        }
        return this.rltvDstngshdNm;
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
     * Adds a new item to the rltvDstngshdNm list.
     * @see #getRltvDstngshdNm()
     * 
     */
    public CertificateIssuer1 addRltvDstngshdNm(RelativeDistinguishedName1 rltvDstngshdNm) {
        getRltvDstngshdNm().add(rltvDstngshdNm);
        return this;
    }

}
