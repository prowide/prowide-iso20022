
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.053.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mktClmCxlReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.053.001.02")
public class MxSeev05300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MktClmCxlReqStsAdvc", required = true)
    protected MarketClaimCancellationRequestStatusAdviceV02 mktClmCxlReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 53;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, CancelledReason9Choice.class, CancelledStatus11Choice.class, CancelledStatusReason12 .class, CancelledStatusReason5Code.class, CashAccountIdentification5Choice.class, CashOption91 .class, CorporateActionEventType29Code.class, CorporateActionEventType85Choice.class, CorporateActionGeneralInformation157 .class, CorporateActionOption11Code.class, CorporateActionOption217 .class, CorporateActionOption30Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateFormat43Choice.class, DateFormat58Choice.class, DateType1Code.class, DateType8Code.class, DocumentIdentification9 .class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, IdentificationSource3Choice.class, MarketClaimCancellationRequestStatus1Choice.class, MarketClaimCancellationRequestStatusAdviceV02 .class, MxSeev05300102 .class, NoReasonCode.class, NoSpecifiedReason1 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PendingCancellationReason7Code.class, PendingCancellationReason8Choice.class, PendingCancellationStatus11Choice.class, PendingCancellationStatusReason11 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity6Choice.class, RateAndAmountFormat40Choice.class, RateType42Choice.class, RateTypeAndPercentageRate8 .class, References26 .class, RejectedReason38Choice.class, RejectedStatus38Choice.class, RejectedStatusReason36 .class, RejectionReason61Code.class, SecuritiesOption76 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.053.001.02";

    public MxSeev05300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev05300102(final String xml) {
        this();
        MxSeev05300102 tmp = parse(xml);
        mktClmCxlReqStsAdvc = tmp.getMktClmCxlReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev05300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mktClmCxlReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimCancellationRequestStatusAdviceV02 }
     *     
     */
    public MarketClaimCancellationRequestStatusAdviceV02 getMktClmCxlReqStsAdvc() {
        return mktClmCxlReqStsAdvc;
    }

    /**
     * Sets the value of the mktClmCxlReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimCancellationRequestStatusAdviceV02 }
     *     
     */
    public MxSeev05300102 setMktClmCxlReqStsAdvc(MarketClaimCancellationRequestStatusAdviceV02 value) {
        this.mktClmCxlReqStsAdvc = value;
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
    public static MxSeev05300102 parse(String xml) {
        return ((MxSeev05300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev05300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev05300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev05300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev05300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev05300102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev05300102) parserImpl.read(MxSeev05300102 .class, xml, _classes));
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
     * Creates an MxSeev05300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev05300102 message
     * @return
     *     a new instance of MxSeev05300102
     */
    public final static MxSeev05300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev05300102 .class);
    }

}
