
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.009.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00900103"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.009.001.03")
public class MxCamt00900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.009.001.03", required = true)
    protected Camt00900103 camt00900103;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, Camt00900103 .class, CashClearingSystem1Code.class, ClearingSystemMemberIdentificationChoice.class, LimitCriteria2 .class, LimitCriteriaDefinition2Choice.class, LimitQueryDefinition2 .class, LimitReturnCriteria.class, LimitSearchCriteria2 .class, LimitType2Code.class, MemberIdentificationChoice.class, MessageIdentification.class, MxCamt00900103 .class, QueryType1Code.class, SimpleIdentificationInformation.class, SystemIdentificationChoice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.009.001.03";

    public MxCamt00900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00900103(final String xml) {
        this();
        MxCamt00900103 tmp = parse(xml);
        camt00900103 = tmp.getCamt00900103();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00900103 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00900103 }
     *     
     */
    public Camt00900103 getCamt00900103() {
        return camt00900103;
    }

    /**
     * Sets the value of the camt00900103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00900103 }
     *     
     */
    public MxCamt00900103 setCamt00900103(Camt00900103 value) {
        this.camt00900103 = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt00900103 parse(String xml) {
        return ((MxCamt00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00900103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00900103) parserImpl.read(MxCamt00900103 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxCamt00900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00900103 message
     * @return
     *     a new instance of MxCamt00900103
     */
    public final static MxCamt00900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00900103 .class);
    }

}
