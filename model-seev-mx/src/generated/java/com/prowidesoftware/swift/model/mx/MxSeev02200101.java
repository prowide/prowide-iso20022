
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.022.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAMvmntStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.022.001.01")
public class MxSeev02200101
    extends AbstractMX
{

    @XmlElement(name = "AgtCAMvmntStsAdvc", required = true)
    protected AgentCAMovementStatusAdviceV01 agtCAMvmntStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCAMovementStatusAdviceV01 .class, AlternateSecurityIdentification3 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType1FormatChoice.class, CorporateActionEventType2Code.class, CorporateActionEventType2FormatChoice.class, CorporateActionInformation1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary1FormatChoice.class, CorporateActionMovementFailedStatus1 .class, CorporateActionMovementProcessingStatus1 .class, CorporateActionMovementRejectionStatus1 .class, CorporateActionMovementRejectionStatus2 .class, CorporateActionMovementStatus1Choice.class, CorporateMovementStatus2 .class, CorporationActionMovementProcessingStatus2 .class, DocumentIdentification8 .class, FailedMovement1 .class, FailedSettlementReason1Code.class, FailedSettlementReason1FormatChoice.class, FinancialInstrumentDescription3 .class, GenericIdentification1 .class, GenericIdentification13 .class, MxSeev02200101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, ProcessedStatus2Code.class, ProcessedStatus2FormatChoice.class, ProcessedStatus3Code.class, ProcessedStatus3FormatChoice.class, RejectionReason13Code.class, RejectionReason13FormatChoice.class, RejectionReason14Code.class, RejectionReason14FormatChoice.class, SecurityIdentification7 .class, UnitOrFaceAmount1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.022.001.01";

    public MxSeev02200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev02200101(final String xml) {
        this();
        MxSeev02200101 tmp = parse(xml);
        agtCAMvmntStsAdvc = tmp.getAgtCAMvmntStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev02200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAMvmntStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAMovementStatusAdviceV01 }
     *     
     */
    public AgentCAMovementStatusAdviceV01 getAgtCAMvmntStsAdvc() {
        return agtCAMvmntStsAdvc;
    }

    /**
     * Sets the value of the agtCAMvmntStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAMovementStatusAdviceV01 }
     *     
     */
    public MxSeev02200101 setAgtCAMvmntStsAdvc(AgentCAMovementStatusAdviceV01 value) {
        this.agtCAMvmntStsAdvc = value;
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
    public static MxSeev02200101 parse(String xml) {
        return ((MxSeev02200101) MxReadImpl.parse(MxSeev02200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev02200101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev02200101) parserImpl.read(MxSeev02200101 .class, xml, _classes));
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
     * Creates an MxSeev02200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev02200101 message
     * @return
     *     a new instance of MxSeev02200101
     */
    public final static MxSeev02200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev02200101 .class);
    }

}
