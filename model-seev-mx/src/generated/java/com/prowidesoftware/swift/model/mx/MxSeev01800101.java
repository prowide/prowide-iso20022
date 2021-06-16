
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.018.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAGblDstrbtnStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.018.001.01")
public class MxSeev01800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAGblDstrbtnStsAdvc", required = true)
    protected AgentCAGlobalDistributionStatusAdviceV01 agtCAGblDstrbtnStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AgentCAGlobalDistributionStatusAdviceV01 .class, AlternateSecurityIdentification3 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionInformation1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, DistributionProcessingStatus1 .class, DistributionRejectionStatus1 .class, DocumentIdentification8 .class, FinancialInstrumentDescription3 .class, GenericIdentification1 .class, GenericIdentification13 .class, GlobalDistributionStatus1 .class, IndividualMovementStatus1 .class, MovementProcessingStatus1 .class, MxSeev01800101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, ProcessedStatus3Code.class, ProcessedStatus3FormatChoice.class, RejectionReason19Code.class, RejectionReason19FormatChoice.class, SecurityIdentification7 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.018.001.01";

    public MxSeev01800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev01800101(final String xml) {
        this();
        MxSeev01800101 tmp = parse(xml);
        agtCAGblDstrbtnStsAdvc = tmp.getAgtCAGblDstrbtnStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev01800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAGblDstrbtnStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAGlobalDistributionStatusAdviceV01 }
     *     
     */
    public AgentCAGlobalDistributionStatusAdviceV01 getAgtCAGblDstrbtnStsAdvc() {
        return agtCAGblDstrbtnStsAdvc;
    }

    /**
     * Sets the value of the agtCAGblDstrbtnStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAGlobalDistributionStatusAdviceV01 }
     *     
     */
    public MxSeev01800101 setAgtCAGblDstrbtnStsAdvc(AgentCAGlobalDistributionStatusAdviceV01 value) {
        this.agtCAGblDstrbtnStsAdvc = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSeev01800101 parse(String xml) {
        return ((MxSeev01800101) MxReadImpl.parse(MxSeev01800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev01800101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev01800101) parserImpl.read(MxSeev01800101 .class, xml, _classes));
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
     * Creates an MxSeev01800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev01800101 message
     * @return
     *     a new instance of MxSeev01800101
     */
    public final static MxSeev01800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev01800101 .class);
    }

}
