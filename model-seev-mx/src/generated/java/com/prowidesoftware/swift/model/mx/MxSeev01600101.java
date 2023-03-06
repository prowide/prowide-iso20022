
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
 * Class for seev.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCADstrbtnBrkdwnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.016.001.01")
public class MxSeev01600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCADstrbtnBrkdwnAdvc", required = true)
    protected AgentCADistributionBreakdownAdviceV01 agtCADstrbtnBrkdwnAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCADistributionBreakdownAdviceV01 .class, AlternateSecurityIdentification3 .class, CashEntitlement1 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionInformation1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, CorporateActionOption1FormatChoice.class, CorporateActionOptionType1Code.class, DateAndDateTimeChoice.class, DateFormat4Choice.class, DateType6Code.class, DocumentIdentification8 .class, Entitlement1 .class, EntitlementAdvice1 .class, FinancialInstrumentDescription3 .class, GenericIdentification1 .class, GenericIdentification13 .class, MxSeev01600101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, SecuritiesEntitlement1 .class, SecurityIdentification7 .class, UnitOrFaceAmount1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.016.001.01";

    public MxSeev01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev01600101(final String xml) {
        this();
        MxSeev01600101 tmp = parse(xml);
        agtCADstrbtnBrkdwnAdvc = tmp.getAgtCADstrbtnBrkdwnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCADstrbtnBrkdwnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCADistributionBreakdownAdviceV01 }
     *     
     */
    public AgentCADistributionBreakdownAdviceV01 getAgtCADstrbtnBrkdwnAdvc() {
        return agtCADstrbtnBrkdwnAdvc;
    }

    /**
     * Sets the value of the agtCADstrbtnBrkdwnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCADistributionBreakdownAdviceV01 }
     *     
     */
    public MxSeev01600101 setAgtCADstrbtnBrkdwnAdvc(AgentCADistributionBreakdownAdviceV01 value) {
        this.agtCADstrbtnBrkdwnAdvc = value;
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
    public static MxSeev01600101 parse(String xml) {
        return ((MxSeev01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev01600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev01600101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev01600101) parserImpl.read(MxSeev01600101 .class, xml, _classes));
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
     * Creates an MxSeev01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev01600101 message
     * @return
     *     a new instance of MxSeev01600101
     */
    public final static MxSeev01600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev01600101 .class);
    }

}
