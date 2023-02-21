
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for HSMSelfTestReport complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMSelfTestReport", propOrder = {
    "hsmTest"
})
public class SwHSMSelfTestReport {

    @XmlElement(name = "HSMTest", required = true)
    protected List<SwHSMTest> hsmTest;

    /**
     * Gets the value of the hsmTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hsmTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSMTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwHSMTest }
     * 
     * 
     */
    public List<SwHSMTest> getHSMTest() {
        if (hsmTest == null) {
            hsmTest = new ArrayList<SwHSMTest>();
        }
        return this.hsmTest;
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
     * Adds a new item to the hSMTest list.
     * @see #getHSMTest()
     * 
     */
    public SwHSMSelfTestReport addHSMTest(SwHSMTest hSMTest) {
        getHSMTest().add(hSMTest);
        return this;
    }

}
