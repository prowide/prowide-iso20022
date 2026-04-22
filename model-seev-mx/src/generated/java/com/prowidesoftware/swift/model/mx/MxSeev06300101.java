
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.063.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "buyrPrtcnInstrCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.063.001.01")
public class MxSeev06300101
    extends AbstractMX
{

    @XmlElement(name = "BuyrPrtcnInstrCxlReqStsAdvc", required = true)
    protected BuyerProtectionInstructionCancellationRequestStatusAdviceV01 buyrPrtcnInstrCxlReqStsAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 63;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity10 .class, AmountPriceType1Code.class, BuyerProtectionInstructionCancellationRequestStatusAdviceV01 .class, CorporateActionElection4 .class, CorporateActionEventType125Choice.class, CorporateActionEventType41Code.class, CorporateActionGeneralInformation195 .class, CorporateActionOption18Code.class, CorporateActionOption47Choice.class, CorporateActionPrice99 .class, DocumentIdentification57 .class, FinancialInstrumentQuantity33Choice.class, GenericIdentification30 .class, IdentificationSource3Choice.class, InstructionCancellationRequestStatus20Choice.class, MxSeev06300101 .class, NoReasonCode.class, OtherIdentification1 .class, PendingCancellationReason8Code.class, PendingCancellationReason9Choice.class, PendingCancellationStatus17Choice.class, PendingCancellationStatusReason12 .class, PercentagePrice1 .class, PriceFormat50Choice.class, PriceFormat66Choice.class, PriceRateType3Code.class, PriceValueType9Code.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, RejectedReason64Choice.class, RejectedStatus62Choice.class, RejectedStatusReason61 .class, RejectionReason88Code.class, RelatedSettlementInstruction4 .class, SecuritiesAccountIdentification1Choice.class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.063.001.01";

    public MxSeev06300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev06300101(final String xml) {
        this();
        MxSeev06300101 tmp = parse(xml);
        buyrPrtcnInstrCxlReqStsAdvc = tmp.getBuyrPrtcnInstrCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev06300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the buyrPrtcnInstrCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionInstructionCancellationRequestStatusAdviceV01 }
     *     
     */
    public BuyerProtectionInstructionCancellationRequestStatusAdviceV01 getBuyrPrtcnInstrCxlReqStsAdvc() {
        return buyrPrtcnInstrCxlReqStsAdvc;
    }

    /**
     * Sets the value of the buyrPrtcnInstrCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionInstructionCancellationRequestStatusAdviceV01 }
     *     
     */
    public MxSeev06300101 setBuyrPrtcnInstrCxlReqStsAdvc(BuyerProtectionInstructionCancellationRequestStatusAdviceV01 value) {
        this.buyrPrtcnInstrCxlReqStsAdvc = value;
        return this;
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
    public static MxSeev06300101 parse(String xml) {
        return ((MxSeev06300101) MxReadImpl.parse(MxSeev06300101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev06300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev06300101) MxReadImpl.parse(MxSeev06300101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev06300101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev06300101) parserImpl.read(MxSeev06300101 .class, xml, _classes));
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
     * Creates an MxSeev06300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev06300101 message
     * @return
     *     a new instance of MxSeev06300101
     */
    public static final MxSeev06300101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev06300101 .class);
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

}
